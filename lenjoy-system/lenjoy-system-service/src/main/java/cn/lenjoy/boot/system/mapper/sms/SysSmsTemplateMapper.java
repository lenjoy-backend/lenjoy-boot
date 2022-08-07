package cn.lenjoy.boot.system.mapper.sms;

import cn.lenjoy.boot.framework.mybatis.core.mapper.LenjoyBaseMapper;
import cn.lenjoy.boot.system.entity.SysSmsTemplate;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 短信模板表 Mapper 接口
 * </p>
 *
 * @author lenjoy zhou
 * @since 2022-08-07
 */
@Mapper
public interface SysSmsTemplateMapper extends LenjoyBaseMapper<SysSmsTemplate> {

}
