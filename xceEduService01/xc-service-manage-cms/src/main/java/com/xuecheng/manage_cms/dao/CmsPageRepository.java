package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author ${zmh}
 * @title: CmsPageRepository
 * @projectName xceEduService01
 * @description: TODO
 * @date 2019/9/321:02
 */
public interface CmsPageRepository extends MongoRepository<CmsPage,String>{
    CmsPage findByPageName(String pageName);
}
