package com.sbc.todo.dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2018-02-02T17:23:42.674+0900")
public class TodoDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.sbc.todo.dao.TodoDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sbc.todo.dao.TodoDao.class, "selectAll");

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sbc.todo.dao.TodoDao.class, "insert", java.lang.String.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sbc.todo.dao.TodoDao.class, "delete", int.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sbc.todo.dao.TodoDao.class, "updDoneFlg", com.sbc.todo.entity.TodoEntity.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sbc.todo.dao.TodoDao.class, "updMemo", com.sbc.todo.entity.TodoEntity.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public TodoDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<com.sbc.todo.entity.TodoEntity> selectAll() {
        entering("com.sbc.todo.dao.TodoDaoImpl", "selectAll");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sbc/todo/dao/TodoDao/selectAll.sql");
            __query.setEntityType(com.sbc.todo.entity._TodoEntity.getSingletonInternal());
            __query.setCallerClassName("com.sbc.todo.dao.TodoDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<com.sbc.todo.entity.TodoEntity>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.sbc.todo.entity.TodoEntity>(com.sbc.todo.entity._TodoEntity.getSingletonInternal()));
            java.util.List<com.sbc.todo.entity.TodoEntity> __result = __command.execute();
            __query.complete();
            exiting("com.sbc.todo.dao.TodoDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sbc.todo.dao.TodoDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public int insert(java.lang.String memo) {
        entering("com.sbc.todo.dao.TodoDaoImpl", "insert", memo);
        try {
            org.seasar.doma.jdbc.query.SqlFileInsertQuery __query = getQueryImplementors().createSqlFileInsertQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sbc/todo/dao/TodoDao/insert.sql");
            __query.addParameter("memo", java.lang.String.class, memo);
            __query.setCallerClassName("com.sbc.todo.dao.TodoDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method1, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.sbc.todo.dao.TodoDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sbc.todo.dao.TodoDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int delete(int id) {
        entering("com.sbc.todo.dao.TodoDaoImpl", "delete", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileDeleteQuery __query = getQueryImplementors().createSqlFileDeleteQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sbc/todo/dao/TodoDao/delete.sql");
            __query.addParameter("id", int.class, id);
            __query.setCallerClassName("com.sbc.todo.dao.TodoDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method2, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.sbc.todo.dao.TodoDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sbc.todo.dao.TodoDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int updDoneFlg(com.sbc.todo.entity.TodoEntity e) {
        entering("com.sbc.todo.dao.TodoDaoImpl", "updDoneFlg", e);
        try {
            if (e == null) {
                throw new org.seasar.doma.DomaNullPointerException("e");
            }
            org.seasar.doma.jdbc.query.SqlFileUpdateQuery __query = getQueryImplementors().createSqlFileUpdateQuery(__method3);
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sbc/todo/dao/TodoDao/updDoneFlg.sql");
            __query.addParameter("e", com.sbc.todo.entity.TodoEntity.class, e);
            __query.setCallerClassName("com.sbc.todo.dao.TodoDaoImpl");
            __query.setCallerMethodName("updDoneFlg");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setEntityAndEntityType("e", e, com.sbc.todo.entity._TodoEntity.getSingletonInternal());
            __query.setNullExcluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method3, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.sbc.todo.dao.TodoDaoImpl", "updDoneFlg", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sbc.todo.dao.TodoDaoImpl", "updDoneFlg", __e);
            throw __e;
        }
    }

    @Override
    public int updMemo(com.sbc.todo.entity.TodoEntity e) {
        entering("com.sbc.todo.dao.TodoDaoImpl", "updMemo", e);
        try {
            if (e == null) {
                throw new org.seasar.doma.DomaNullPointerException("e");
            }
            org.seasar.doma.jdbc.query.SqlFileUpdateQuery __query = getQueryImplementors().createSqlFileUpdateQuery(__method4);
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sbc/todo/dao/TodoDao/updMemo.sql");
            __query.addParameter("e", com.sbc.todo.entity.TodoEntity.class, e);
            __query.setCallerClassName("com.sbc.todo.dao.TodoDaoImpl");
            __query.setCallerMethodName("updMemo");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setEntityAndEntityType("e", e, com.sbc.todo.entity._TodoEntity.getSingletonInternal());
            __query.setNullExcluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method4, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.sbc.todo.dao.TodoDaoImpl", "updMemo", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sbc.todo.dao.TodoDaoImpl", "updMemo", __e);
            throw __e;
        }
    }

}
