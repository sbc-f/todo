package com.sbc.todo.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2018-01-31T23:00:30.489+0900")
public final class _TodoEntity extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.sbc.todo.entity.TodoEntity> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final _TodoEntity __singleton = new _TodoEntity();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    /** the id */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sbc.todo.entity.TodoEntity, java.lang.Integer, Object> $id = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sbc.todo.entity.TodoEntity.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "id", "", __namingType, true, true, false);

    /** the memo */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sbc.todo.entity.TodoEntity, java.lang.String, Object> $memo = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sbc.todo.entity.TodoEntity.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "memo", "", __namingType, true, true, false);

    /** the doneFlg */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sbc.todo.entity.TodoEntity, java.lang.Boolean, Object> $doneFlg = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sbc.todo.entity.TodoEntity.class, java.lang.Boolean.class, java.lang.Boolean.class, () -> new org.seasar.doma.wrapper.BooleanWrapper(), null, null, "doneFlg", "", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<com.sbc.todo.entity.TodoEntity>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sbc.todo.entity.TodoEntity, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sbc.todo.entity.TodoEntity, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sbc.todo.entity.TodoEntity, ?>> __entityPropertyTypeMap;

    private _TodoEntity() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "TodoEntity";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sbc.todo.entity.TodoEntity, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sbc.todo.entity.TodoEntity, ?>> __list = new java.util.ArrayList<>(3);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sbc.todo.entity.TodoEntity, ?>> __map = new java.util.HashMap<>(3);
        __list.add($id);
        __map.put("id", $id);
        __list.add($memo);
        __map.put("memo", $memo);
        __list.add($doneFlg);
        __map.put("doneFlg", $doneFlg);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return getTableName(org.seasar.doma.jdbc.Naming.DEFAULT::apply);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(com.sbc.todo.entity.TodoEntity entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.sbc.todo.entity.TodoEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.sbc.todo.entity.TodoEntity entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.sbc.todo.entity.TodoEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.sbc.todo.entity.TodoEntity entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.sbc.todo.entity.TodoEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.sbc.todo.entity.TodoEntity entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.sbc.todo.entity.TodoEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.sbc.todo.entity.TodoEntity entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.sbc.todo.entity.TodoEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.sbc.todo.entity.TodoEntity entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.sbc.todo.entity.TodoEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sbc.todo.entity.TodoEntity, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.sbc.todo.entity.TodoEntity, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sbc.todo.entity.TodoEntity, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.sbc.todo.entity.TodoEntity, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.sbc.todo.entity.TodoEntity, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.sbc.todo.entity.TodoEntity newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.sbc.todo.entity.TodoEntity, ?>> __args) {
        com.sbc.todo.entity.TodoEntity entity = new com.sbc.todo.entity.TodoEntity();
        if (__args.get("id") != null) __args.get("id").save(entity);
        if (__args.get("memo") != null) __args.get("memo").save(entity);
        if (__args.get("doneFlg") != null) __args.get("doneFlg").save(entity);
        return entity;
    }

    @Override
    public Class<com.sbc.todo.entity.TodoEntity> getEntityClass() {
        return com.sbc.todo.entity.TodoEntity.class;
    }

    @Override
    public com.sbc.todo.entity.TodoEntity getOriginalStates(com.sbc.todo.entity.TodoEntity __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.sbc.todo.entity.TodoEntity __entity) {
    }

    /**
     * @return the singleton
     */
    public static _TodoEntity getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _TodoEntity newInstance() {
        return new _TodoEntity();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<com.sbc.todo.entity.TodoEntity> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
