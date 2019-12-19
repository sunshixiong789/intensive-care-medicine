package com.mskysoft.baseservice.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * antd 的树形结构数据
 *
 * @author sunshixiong（1285913468@qq.com）
 * @date 2019/10/21-14:42
 */
@Data
@NoArgsConstructor
public class TreeData {

  private String title;

  private String key;

  private Boolean isLeaf;

  private List<TreeData> children;
}
