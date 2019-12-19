package com.mskysoft.baseservice.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * description:有关文件方面的接口
 *
 * @author daiminghang
 * @date 2019/10/21 16:42
 */
@Api(tags = "文件")
@NoArgsConstructor
@RestController
@RequestMapping("file")
public class FileController {

    private static final Logger logger = LoggerFactory.getLogger(FileController.class);

    /**
     * 文件上传
     *
     * @param file     上传的文件
     * @param filePath 上传文件地址
     * @return 上传结果
     */
    @PostMapping("/upload")
    @ApiOperation("文件上传")
    public String upload(@RequestParam("file") MultipartFile file, String filePath) {
        if (file.isEmpty()) {
            return "文件为空，请选择文件";
        }
        // 获取原始文件名
        String fileName = file.getOriginalFilename();
        logger.info("上传的文件名为：" + fileName);
        // 文件对象
        File dest = new File(filePath + fileName);
        // 判断路径是否存在，如果不存在则创建
        if (!dest.getParentFile().exists()) {
            boolean mkdirs = dest.getParentFile().mkdirs();
            if (!mkdirs) {
                return "创建文件夹失败";
            }
        }
        try {
            file.transferTo(dest);
            return "上传成功";
        } catch (IllegalStateException | IOException e) {
            e.printStackTrace();
        }
        return "上传失败";
    }

    /**
     * 文件下载
     *
     * @param response 响应
     * @param filePath 文件地址
     * @param fileName 文件名
     */
    @GetMapping("/download")
    @ApiOperation("文件下载")
    @ApiImplicitParams({@ApiImplicitParam(name = "filePath", value = "文件地址"),
            @ApiImplicitParam(name = "fileName", value = "文件名")})
    public String download(HttpServletResponse response, String filePath, String fileName) {
        if (fileName != null) {
            File file = new File(filePath, fileName);
            if (file.exists()) {
                // 设置强制下载不打开
                response.setContentType("application/force-download");
                // 设置文件名
                response.addHeader("Content-Disposition", "attachment;fileName=" + fileName);
                byte[] buffer = new byte[1024];
                FileInputStream fis = null;
                BufferedInputStream bis = null;
                try {
                    fis = new FileInputStream(file);
                    bis = new BufferedInputStream(fis);
                    OutputStream os = response.getOutputStream();
                    int i = bis.read(buffer);
                    while (i != -1) {
                        os.write(buffer, 0, i);
                        i = bis.read(buffer);
                    }
                    logger.info("下载成功");
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (bis != null) {
                        try {
                            bis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (fis != null) {
                        try {
                            fis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return null;
    }

    /**
     * 文件删除
     *
     * @param filePath 文件地址
     * @param fileName 文件名
     * @return 删除结果
     */
    @GetMapping(value = "/deleteFile")
    @ApiOperation("文件删除")
    @ApiImplicitParams({@ApiImplicitParam(name = "filePath", value = "文件地址"),
            @ApiImplicitParam(name = "fileName", value = "文件名")})
    public String deleteFile(String filePath, String fileName) {
        String resultInfo = null;
        if (fileName != null) {
            File file = new File(filePath + fileName);
            if (file.exists()) {
                if (file.delete()) {
                    resultInfo = "1-删除成功";
                } else {
                    resultInfo = "0-删除失败";
                }
            } else {
                resultInfo = "文件不存在！";
            }
        }
        return resultInfo;
    }
}
