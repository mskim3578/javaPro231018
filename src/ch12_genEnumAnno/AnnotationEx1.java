package ch12_genEnumAnno;

class Parent {
	void parentMethod() { }
}


class AnnotationEx1 extends Parent {
	@Override
	void parentmethod() { } // 조상 메서드의 이름을 잘못적었음. 
}