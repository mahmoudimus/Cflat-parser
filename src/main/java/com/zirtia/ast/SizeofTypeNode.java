package com.zirtia.ast;
import com.zirtia.type.*;

public class SizeofTypeNode extends ExprNode {
    protected TypeNode operand;
    protected TypeNode type;

    public SizeofTypeNode(TypeNode operand, TypeRef type) {
        this.operand = operand;
        this.type = new TypeNode(type);
    }

    public Type operand() {
        return operand.type();
    }

    public TypeNode operandTypeNode() {
        return operand;
    }

    public Type type() {
        return type.type();
    }

    public TypeNode typeNode() {
        return type;
    }

    public <S,E> E accept(ASTVisitor<S,E> visitor) {
        return visitor.visit(this);
    }
}
