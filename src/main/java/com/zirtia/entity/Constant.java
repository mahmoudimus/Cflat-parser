package com.zirtia.entity;
import com.zirtia.ast.TypeNode;
import com.zirtia.ast.ExprNode;

public class Constant extends Entity {
    private TypeNode type;
    private String name;
    private ExprNode value;

    public Constant(TypeNode type, String name, ExprNode value) {
        super(true, type, name);
        this.value = value;
    }

    public boolean isAssignable() { return false; }
    public boolean isDefined() { return true; }
    public boolean isInitialized() { return true; }
    public boolean isConstant() { return true; }

    public ExprNode value() { return value; }



    public <T> T accept(EntityVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
