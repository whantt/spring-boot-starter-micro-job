/*
 * This file is generated by jOOQ.
 */
package com.gitee.hengboy.micro.job.data.model;


import com.gitee.hengboy.micro.job.data.model.tables.JobNodeExecuteDetail;
import com.gitee.hengboy.micro.job.data.model.tables.JobNodeInfo;
import com.gitee.hengboy.micro.job.data.model.tables.JobNodeTriggerInfo;
import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;

import javax.annotation.Generated;


/**
 * A class modelling indexes of tables of the <code>fission</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index JOB_NODE_EXECUTE_DETAIL_PRIMARY = Indexes0.JOB_NODE_EXECUTE_DETAIL_PRIMARY;
    public static final Index JOB_NODE_INFO_PRIMARY = Indexes0.JOB_NODE_INFO_PRIMARY;
    public static final Index JOB_NODE_TRIGGER_INFO_PRIMARY = Indexes0.JOB_NODE_TRIGGER_INFO_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index JOB_NODE_EXECUTE_DETAIL_PRIMARY = Internal.createIndex("PRIMARY", JobNodeExecuteDetail.JOB_NODE_EXECUTE_DETAIL, new OrderField[] { JobNodeExecuteDetail.NED_ID }, true);
        public static Index JOB_NODE_INFO_PRIMARY = Internal.createIndex("PRIMARY", JobNodeInfo.JOB_NODE_INFO, new OrderField[] { JobNodeInfo.JNI_ID }, true);
        public static Index JOB_NODE_TRIGGER_INFO_PRIMARY = Internal.createIndex("PRIMARY", JobNodeTriggerInfo.JOB_NODE_TRIGGER_INFO, new OrderField[] { JobNodeTriggerInfo.NTI_ID }, true);
    }
}
