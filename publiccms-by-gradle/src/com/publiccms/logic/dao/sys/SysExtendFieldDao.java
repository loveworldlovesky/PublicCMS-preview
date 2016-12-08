package com.publiccms.logic.dao.sys;

import java.util.ArrayList;
import java.util.List;

// Generated 2016-3-2 13:39:54 by com.sanluan.common.source.SourceMaker

import org.springframework.stereotype.Repository;

import com.publiccms.entities.sys.SysExtendField;
import com.sanluan.common.base.BaseDao;
import com.sanluan.common.handler.QueryHandler;

@Repository
public class SysExtendFieldDao extends BaseDao<SysExtendField> {
    public List<?> getList(Integer extendId) {
        if (notEmpty(extendId)) {
            QueryHandler queryHandler = getQueryHandler("from SysExtendField bean");
            if (notEmpty(extendId)) {
                queryHandler.condition("bean.id.extendId = :extendId").setParameter("extendId", extendId);
            }
            queryHandler.order("bean.sort asc");
            return getList(queryHandler);
        }
        return new ArrayList<SysExtendField>();
    }

    @Override
    protected SysExtendField init(SysExtendField entity) {
        return entity;
    }

}