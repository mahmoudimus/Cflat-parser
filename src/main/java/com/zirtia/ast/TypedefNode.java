package com.zirtia.ast;
import com.zirtia.type.*;

public class TypedefNode extends TypeDefinition {
    protected TypeNode real;

    public TypedefNode(Location loc, TypeRef real, String name) {
        super(loc, new UserTypeRef(name), name);
        this.real = new TypeNode(real);
    }

    public boolean isUserType() {
        return true;
    }

    public TypeNode realTypeNode() {
        return real;
    }

    public Type realType() {
        return real.type();
    }

    public TypeRef realTypeRef() {
        return real.typeRef();
    }

    public Type definingType() {
        return new UserType(name(), realTypeNode(), location());
    }


    public <T> T accept(DeclarationVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
