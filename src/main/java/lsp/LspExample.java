package lsp;

class A {
  public void f1a() {}

  public int f2() {
    return 0;
  }
}

//class B extends A {
//  // Should be able to do f1 and f2
//  // Can be achieved by extending
//  public void f3() {}
//}


// We can use delegation/composition to avoid violating LSP
class B {
  private final A a = new A();

  public void f1() {
    a.f1a();
  }

  public int f2() {
    return a.f2();
  }

  public void f3() {}

  // But now we violate DRY and OCP
  // We've doubled the effort of writing code that does the same thing
  // And when we change the f1/f2 of A, we're forced to modify the implementation in B
  // So which way do we go?
  // Some languages can solve all these problems for us
}

public class LspExample {
  public static void main(String[] args) {
    System.out.println("OK");
  }
}
