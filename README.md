# 토비의 스프링 실습

이 저장소는 **토비의 스프링 3.1** 책을 기반으로 한 실습 프로젝트입니다. 이 프로젝트는 스프링 프레임워크의 핵심 개념들을 직접 코드로 구현하여, 프레임워크의 작동 원리와 철학을 깊이 있게 이해하는 것을 목표로 합니다.

## 목차
1. [프로젝트 개요](#프로젝트-개요)
2. [핵심 개념](#핵심-개념)
   - [제어의 역전 (IoC)](#제어의-역전-ioc)
   - [의존성 주입 (DI)](#의존성-주입-di)
   - [관점 지향 프로그래밍 (AOP)](#관점-지향-프로그래밍-aop)
3. [실습 내용](#실습-내용)
   - [IoC와 DI 적용](#ioc와-di-적용)
   - [AOP 적용](#aop-적용)
   - [빈(Bean) 관리와 생명주기](#빈bean-관리와-생명주기)
   - [테스트 주도 개발(TDD)](#테스트-주도-개발tdd)
4. [참고 자료](#참고-자료)

---

## 프로젝트 개요
이 프로젝트는 **토비의 스프링 3.1 Vol. 1 스프링의 이해와 원리**에서 다룬 내용을 실습하는 저장소입니다. 스프링 프레임워크의 핵심 개념을 실습하며, 애플리케이션 개발 시 스프링의 역할과 동작 방식을 체험할 수 있습니다.

---

## 핵심 개념

### 제어의 역전 (IoC, Inversion of Control)
- IoC는 **프레임워크가 객체의 생성과 제어를 담당**하여, 개발자가 객체의 생명주기를 직접 관리하지 않게 하는 개념입니다. 스프링은 이 개념을 활용하여 **스프링 컨테이너**가 객체의 생성 및 의존성을 주입하고, 소멸까지 관리합니다.

### 의존성 주입 (DI, Dependency Injection)
- DI는 **객체 간의 의존성을 외부에서 주입**하는 방식입니다. 개발자는 코드에서 직접 의존성을 설정하지 않고, 스프링 컨테이너가 의존성을 자동으로 주입합니다. 이를 통해 결합도를 낮추고 코드의 유연성을 높입니다.

### 관점 지향 프로그래밍 (AOP, Aspect-Oriented Programming)
- AOP는 **비즈니스 로직과 공통 기능(예: 트랜잭션, 로깅)을 분리**하는 방법입니다. 스프링은 AOP를 활용해 트랜잭션 관리, 로깅 등의 공통 관심사를 비즈니스 로직과 분리하여 코드의 재사용성과 유지보수성을 높입니다.

---

## 실습 내용

### IoC와 DI 적용
- 이 실습에서는 **IoC 컨테이너**를 통해 객체의 생성과 의존성을 자동으로 관리하는 방법을 다룹니다. **DI를 통해 객체 간의 의존성을 주입**하는 방식도 실습합니다.
  - 예: `@Autowired`, `@Component`, `@Configuration`과 같은 어노테이션을 사용해 **스프링 빈을 정의하고 관리**하는 방법.

### AOP 적용
- AOP를 활용해 **트랜잭션 관리**나 **로깅** 같은 공통 기능을 비즈니스 로직과 분리하는 실습입니다.
  - 예: `@Aspect`와 `@Around`, `@Before` 등을 사용하여 **AOP 적용**.
  - **Cross-cutting Concerns**를 통해 여러 모듈에서 공통 기능을 쉽게 적용할 수 있습니다.

### 빈(Bean) 관리와 생명주기
- 스프링에서 **빈(Bean)의 생성과 소멸** 과정을 이해하고 관리하는 실습입니다.
  - `@PostConstruct`, `@PreDestroy` 등을 통해 **빈의 생명주기**를 제어하는 방법을 학습합니다.
  - **싱글톤 빈**과 **프로토타입 빈**의 차이점과 그 적용 방식을 실습합니다.

### 테스트 주도 개발(TDD)
- **테스트 주도 개발(TDD)**을 통해 **스프링 애플리케이션의 테스트**를 작성하는 실습입니다. JUnit과 스프링 테스트 컨텍스트를 사용하여 **단위 테스트**와 **통합 테스트**를 작성하고 실행하는 방법을 학습합니다.
  - 예: `@SpringBootTest`, `@MockBean` 등을 사용한 테스트 실습.
  
---

## 참고 자료
- **[토비의 스프링 3.1 Vol. 1 스프링의 이해와 원리](https://book.naver.com/bookdb/book_detail.nhn?bid=7006519)**: 본 프로젝트의 기반이 되는 서적입니다.
- **[스프링 공식 문서](https://docs.spring.io/spring-framework/docs/current/reference/html/)**: 스프링 프레임워크에 대한 상세한 문서와 레퍼런스를 제공합니다.
