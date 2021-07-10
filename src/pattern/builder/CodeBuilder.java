package pattern.builder;

import java.util.HashMap;
import java.util.Map;

public class CodeBuilder
{
    private final String className;
    private final Map<String, String> fields = new HashMap<>();


    public CodeBuilder(String className)
    {
        this.className = className;
    }

    public CodeBuilder addField(String name, String type)
    {
        this.fields.put(name,type);
        return this;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append("public class ").append(this.className).append("\n");
        sb.append("{\n");
        fields.forEach((key, value) -> sb.append("  public ").append(value).append(" ").append(key).append(";\n"));
        sb.append("}");
        return sb.toString();
    }

    public static void main(String[] args) {
        CodeBuilder cb = new CodeBuilder("Person").addField("name","String").addField("age","int");
        System.out.println(cb);
    }
}
