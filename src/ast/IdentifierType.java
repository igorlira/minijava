package ast;
import visitor.Visitor;
import visitor.TypeVisitor;

public class IdentifierType extends Type {
  public String s;

  public IdentifierType(String as) {
    s=as;
  }

  public void accept(Visitor v) {
    v.visit(this);
  }

  public Type accept(TypeVisitor v) {
    return v.visit(this);
  }
  
  @Override
  public boolean equals(Object obj) {
	if (obj instanceof IdentifierType) {
		IdentifierType id = (IdentifierType) obj;
		return super.equals(obj) || this.s.equals(id.s);
	}
	else {
		return super.equals(obj);
	}
  }
}
