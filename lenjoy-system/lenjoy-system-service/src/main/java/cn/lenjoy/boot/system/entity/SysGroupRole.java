package cn.lenjoy.boot.system.entity;

import cn.lenjoy.boot.framework.mybatis.core.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户组角色表
 * </p>
 *
 * @author lenjoy zhou
 * @since 2022-08-07
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("sys_group_role")
public class SysGroupRole extends BaseEntity {

    /**
     * 用户组ID
     */
    @TableField("group_id")
    private Long groupId;

    /**
     * 角色ID
     */
    @TableField("role_id")
    private Long roleId;


}
