Call by value와 Call by reference

> call by value
값에 의한 호출

함수가 호출될 때, 메모리 공간 안에서는 함수를 위한 별도의 임시공간이 생성됨 (종료 시 해당 공간 사라짐)

call by value 호출 방식은 함수 호출 시 전달되는 변수 값을 복사해서 함수 인자로 전달함

이때 복사된 인자는 함수 안에서 지역적으로 사용되기 때문에 local value 속성을 가짐

따라서, 함수 안에서 인자 값이 변경되더라도, 외부 변수 값은 변경안됨
   
ex)   
```java
void func(int n) {
    *n = 20;
}

void main() {
    int n = 10;
    func(n);
    printf("%d", n);
}
```
