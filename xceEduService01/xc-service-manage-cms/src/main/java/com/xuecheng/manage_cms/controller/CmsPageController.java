package com.xuecheng.manage_cms.controller;

import com.xuecheng.api.cms.CmsPageControllerApi;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.manage_cms.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @title: CmsPageController
 * @projectName xceEduService01
 * @description: TODO
 * @date 2019/7/521:12
 */
@RestController
@RequestMapping("/cms/page")
public class CmsPageController implements CmsPageControllerApi{

    @Autowired
    PageService pageService;

    @Override
    @GetMapping("/list/{page}/{size}") //在url中传参，在方法参数列表中接收
    public QueryResponseResult findList(@PathVariable("page") int page, @PathVariable("size") int size, QueryPageRequest queryPageRequest) {
     /*  QueryResult queryResult = new QueryResult();
        queryResult.setTotal(2);
        List list = new ArrayList();
        CmsPage cmsPage = new CmsPage();
        cmsPage.setPageName("测试页面");
        list.add(cmsPage);
        queryResult.setList(list);
        QueryResponseResult queryResponseResult = new QueryResponseResult(CommonCode.SUCCESS,queryResult);
        return queryResponseResult;*/
        return pageService.findList(page,size,queryPageRequest);
    }
}
