package com.publiccms.views.directive.cms;

// Generated 2015-7-10 16:36:23 by com.sanluan.common.source.SourceMaker

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.publiccms.common.base.AbstractTemplateDirective;
import com.publiccms.logic.service.cms.CmsTagTypeService;
import com.sanluan.common.handler.PageHandler;
import com.sanluan.common.handler.RenderHandler;

@Component
public class CmsTagTypeListDirective extends AbstractTemplateDirective {

    @Override
    public void execute(RenderHandler handler) throws IOException, Exception {
        PageHandler page = service.getPage(getSite(handler).getId(), handler.getString("name"),
                handler.getInteger("pageIndex", 1), handler.getInteger("count", 20));
        handler.put("page", page).render();
    }

    @Autowired
    private CmsTagTypeService service;

}