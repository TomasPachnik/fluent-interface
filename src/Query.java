public class Query {

    StringBuilder builder;

    public Query() {
        this.builder = new StringBuilder();
    }

    public Query select(String column) {
        builder.append("SELECT " + column);
        return this;
    }

    public Query from(String tableName) {
        builder.append(" FROM " + tableName);
        return this;
    }

    public Query where(String value) {
        builder.append(" WHERE " + value);
        return this;
    }

    public Query isEqual(String value) {
        builder.append(" = '" + value + "'");
        return this;
    }

    public Query isEqual(int value) {
        builder.append(" = " + value);
        return this;
    }

    public Query and(String value) {
        builder.append(" AND '" + value + "'");
        return this;
    }

    @Override
    public String toString() {
        builder.append(";");
        return builder.toString();
    }
}
