package com.xuecheng.framework.domain.cms.request;

import com.xuecheng.framework.model.request.RequestData;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Administrator
 * @title: QueryPageRequest
 * @projectName xceEduService01
 * @description: TODO
 * @date 2019/7/517:55
 */
@Data
public class QueryPageRequest extends RequestData {

    //站点id

    @ApiModelProperty("站点id")
    private String siteId;
    //页面id
    @ApiModelProperty("页面id")
    private String pageId;
    //页面名称
    @ApiModelProperty("页面名称")
    private String pageName;
    //页面别名
    @ApiModelProperty("页面别名")
    private String pageAliase;
    //模板id
    @ApiModelProperty("模板id")
    private String templateId;
}
