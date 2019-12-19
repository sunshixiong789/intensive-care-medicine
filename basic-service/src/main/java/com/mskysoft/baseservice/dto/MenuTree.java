package com.mskysoft.baseservice.dto;

import com.mskysoft.baseservice.entity.Menu;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * 菜单数据
 *
 * @author sunshixiong（1285913468@qq.com）
 * @date 2019/10/21-15:22
 */
@Getter
@Setter
@NoArgsConstructor
public class MenuTree extends Menu {

  private List<MenuTree> children;
}
