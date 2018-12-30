package com.zirtia.ast;

import com.zirtia.type.*;

import java.util.List;

abstract public class CompositeTypeDefinition extends TypeDefinition {
    protected List<Slot> members;

    public CompositeTypeDefinition(TypeRef ref,
                                   String name, List<Slot> membs) {
        super(ref, name);
        members = membs;
    }

    public boolean isCompositeType() {
        return true;
    }

    abstract public String kind();

    public List<Slot> members() {
        return members;
    }
}
