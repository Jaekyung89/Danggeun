---
## 1. 프로젝트 소개

[오르미 11기 백엔드 개발자 부트캠프]  
'챗봇상담사가 있는 중고거래 플랫폼' 구현 클론 프로젝트

# 🛠️ 개발 서비스 소개

💡 **당근마켓 클론페이지**는 지역 기반 중고 거래 플랫폼인 당근마켓(Daangn Market)의 주요 기능과 사용자 경험을 모방하여 구현한 웹 애플리케이션입니다.  
실시간 채팅 기능과 더불어 **AI 챗봇 고객센터**를 통해 빠르고 정확한 거래 지원을 제공합니다.

## 🔧 개발 목적

- 지역 기반 중고 거래 플랫폼의 기능 이해
- 실제 서비스 수준의 CRUD, 인증, 채팅 등의 기능 구현
- **AI 챗봇을 통한 고객 지원 자동화 경험 추가**
- 모바일 친화 UI/UX 설계 및 반응형 웹 개발 연습
- 실전 프로젝트 경험을 통한 포트폴리오 구축

## 🚀 사용 기술 스택

### Backend

- Java 17
- Spring Boot, Spring MVC
- Spring Security, OAuth2 (Google 로그인)
- JPA, Hibernate
- WebSocket (채팅)

### Frontend

- HTML5, CSS3 (SCSS)
- JavaScript (ES6+)
- Thymeleaf

### AI / 챗봇

- OpenAI GPT API
- JSON 파싱 및 프롬프트 구조화

### Infrastructure & DevOps

- AWS S3 (이미지 업로드 등 정적 리소스 저장)
- MySQL
- Git, GitHub
- IntelliJ IDEA

### 협업 도구

- GitHub (이슈/PR 관리)
- Notion (기획/정리)
- Discord (실시간 회의)
- Figma (디자인 참고)

---
![중고거래 챗봇 플랫폼 미리보기](https://github-production-user-asset-6210df.s3.amazonaws.com/206796478/469081889-ac351371-3ae5-4366-9ad3-080bdb3e7b7c.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20250722%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20250722T083200Z&X-Amz-Expires=300&X-Amz-Signature=7dd2bda867119f26dfb9bc774b39987873b303af6a9a7e63e79f05e17e0f51ea&X-Amz-SignedHeaders=host)

## 2. 팀원 소개 및 역할
### 🔗 팀원 GitHub 및 프로필 이미지

| 이름     | GitHub | 이미지 |
|--------|--------|--------|
|👑<br/>김재경| [github.com/Jaekyung89](https://github.com/Jaekyung89) | ![](https://github-production-user-asset-6210df.s3.amazonaws.com/206796478/469100700-1e90815d-c360-4df5-8182-da8c002dc597.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20250722%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20250722T090430Z&X-Amz-Expires=300&X-Amz-Signature=a5cd49f165cec3c4463edabd33fc8c0a8a59b4d01e7e0c417e0d59a7f355878f&X-Amz-SignedHeaders=host) |
| 이소연    | [github.com/BlueGiraffe07](https://github.com/BlueGiraffe07) | ![](https://github-production-user-asset-6210df.s3.amazonaws.com/206796478/469098671-2a0347d3-96f6-4ada-9176-76f6a46c0509.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20250722%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20250722T090049Z&X-Amz-Expires=300&X-Amz-Signature=724de7ad7f3ece06eb180540d50f981a52299780069ad6ca2156e0c340316c50&X-Amz-SignedHeaders=host) |
| 김예은    | [github.com/yeeunkim7](https://github.com/yeeunkim7) | ![](https://github-production-user-asset-6210df.s3.amazonaws.com/206796478/469100770-1e0a6eb0-167b-4a63-9577-1468e657381f.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20250722%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20250722T090424Z&X-Amz-Expires=300&X-Amz-Signature=19fa818cc6ca754726e52c8826d52eaae1ecb41a26665d6ad5add33f3d735d19&X-Amz-SignedHeaders=host) |
| 김민형    | [github.com/KimTeaHyeong1](https://github.com/KimTeaHyeong1) | ![](https://github-production-user-asset-6210df.s3.amazonaws.com/206796478/469100335-fae37dfb-9a4f-4c58-9935-cccff18425f8.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20250722%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20250722T090801Z&X-Amz-Expires=300&X-Amz-Signature=b4978838e60b37c95569fa9844be86207501e664d9314eeeff5e7af0c082206e&X-Amz-SignedHeaders=host) |


| 이름     | 담당 역할                               |
|--------|-------------------------------------|
| 👑 김재경 | 팀장, 챗봇 연동, Trade 페이지                |
| 이소연    | 메인페이지, Notion, 발표자료(PPT), README 정리 |
| 김예은    | 소셜 로그인, 회원가입, AWS S3 이미지 업로드        |
| 김민형    | Post기능, 채팅페이지                       |

> 🎨 [피그마 디자인 시안 바로가기](https://www.figma.com/design/kSMua8TOVGIIPbNH1jie1Q/%EC%98%A4%EB%A5%B4%EB%AF%B8-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%EB%8B%B9%EA%B7%BC%EB%A7%88%EC%BC%93Web-%ED%81%B4%EB%A1%A0%EC%BD%94%EB%94%A9-?node-id=0-1&p=f)

---

## 3. ERD 구조

> 📌 ERD 다이어그램 (db 설계)
![중고거래 챗봇 플랫폼 미리보기](https://github-production-user-asset-6210df.s3.amazonaws.com/206796478/469081800-5d4175f7-d19d-4fc2-b083-89b1a2ec0fc4.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20250722%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20250722T083649Z&X-Amz-Expires=300&X-Amz-Signature=d136cfd8beff56a0a174579968594a10ea729b681f0f8ea3d14ef7996bcbbbad&X-Amz-SignedHeaders=host)
---

## 4. 페이지 구성 및 주요 기능
### 4-1. 페이지 구성

- 로그인(Login)
  ![중고거래 챗봇 플랫폼 미리보기](https://github-production-user-asset-6210df.s3.amazonaws.com/206796478/469080132-8bf144ea-87f7-4ad3-b451-c4ca7b7e949c.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20250722%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20250722T084508Z&X-Amz-Expires=300&X-Amz-Signature=76686328c9b2d709e31d611eba5bd03b98c68cebe5e3ff0b056de65430e4e96c&X-Amz-SignedHeaders=host)
- 회원가입(Register)
  ![중고거래 챗봇 플랫폼 미리보기](https://github-production-user-asset-6210df.s3.amazonaws.com/206796478/469080192-e620833c-7c3c-468f-b99f-132072bd4472.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20250722%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20250722T084523Z&X-Amz-Expires=300&X-Amz-Signature=85ac7dffbc185a21522947950dda6b6fab8e78e7cc697a65b0843009cebccc93&X-Amz-SignedHeaders=host)
- 메인페이지(MainPage)
  ![중고거래 챗봇 플랫폼 미리보기](https://github-production-user-asset-6210df.s3.amazonaws.com/206796478/469080244-afd1c224-63c3-4f85-be96-bbeefb2c940a.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20250722%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20250722T084608Z&X-Amz-Expires=300&X-Amz-Signature=a45c598279009a7734ef3e75c45d0f4d9b77c08b4f01c83821b5f11c84711647&X-Amz-SignedHeaders=host)
- 상품거래(Trade)
  ![중고거래 챗봇 플랫폼 미리보기](https://github-production-user-asset-6210df.s3.amazonaws.com/206796478/469095282-ca12f3b8-64f6-4f4a-aab4-42d2111446bb.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20250722%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20250722T085430Z&X-Amz-Expires=300&X-Amz-Signature=ceabf38f70dded5dc08799a260de5749e9367e6727f1d7e743c9ca47d920ed3d&X-Amz-SignedHeaders=host)
- 상품 상세(Trdae-item)
  ![중고거래 챗봇 플랫폼 미리보기](https://github-production-user-asset-6210df.s3.amazonaws.com/206796478/469081406-5ea13ac7-d32a-4a4f-8693-e2c244406aed.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20250722%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20250722T084714Z&X-Amz-Expires=300&X-Amz-Signature=1221dff5cf0451ac373036e30f0bf294a7e0fd6b02e8f392ea3f041b46b612c0&X-Amz-SignedHeaders=host)
- 상품 등록(Trade-write)
  ![중고거래 챗봇 플랫폼 미리보기](https://github-production-user-asset-6210df.s3.amazonaws.com/206796478/469081347-fbf7dee1-83ed-49e8-8285-3f4844ceaa79.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20250722%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20250722T084647Z&X-Amz-Expires=300&X-Amz-Signature=4b548e5117285abde0279fe025d4c9c2dce7f68fea80fa212f6165309f7b1415&X-Amz-SignedHeaders=host)
- AI채팅(Chatbot)
  ![중고거래 챗봇 플랫폼 미리보기](https://github-production-user-asset-6210df.s3.amazonaws.com/206796478/469081278-681b1b16-7037-498c-94ac-a5d279ade42a.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20250722%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20250722T084625Z&X-Amz-Expires=300&X-Amz-Signature=1d9ded438fe701e97237845996346d6df7f768ac3a61142000b9909010a26426&X-Amz-SignedHeaders=host)
- 위치(AreaConfirm)
  ![중고거래 챗봇 플랫폼 미리보기](https://github-production-user-asset-6210df.s3.amazonaws.com/206796478/469096462-7b670662-6077-4157-9663-7f2a1478ef7c.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20250722%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20250722T085643Z&X-Amz-Expires=300&X-Amz-Signature=bcefc5e55156b45efc6dea347a7a05f374d7bade9c592b4c336cec8758ebca0b&X-Amz-SignedHeaders=host)

### 4-2. 페이지 주요기능
| 페이지 | 경로 | 주요 기능 |
|--------|------|-----------|
| 메인페이지 | `/` | 서비스 소개, 인기매물, 인기검색어 |
| 회원가입 | `/register` | 이메일, 비밀번호, 닉네임 입력 |
| 로그인 | `/login` | 이메일 로그인, Google OAuth |
| 상품 목록 | `/trade` | 인기 중고 거래 목록 조회 |
| 상품 상세 | `/trade/item/{id}` | 상세 정보, 채팅 시작 |
| 상품 등록 | `/trade/write` | 이미지 포함 상품 등록 폼 |
| 검색 | `/search` | 키워드 검색 + 페이지네이션 |
| 채팅 | `/chat` | WebSocket 실시간 채팅 |
| 챗봇 | `/chatBot` | OpenAI 기반 고객센터 응답 |
| 마이페이지 | `/mypage` | 내 거래, 관심글, 설정 |
| 위치 인증 | `/confirm` | Google Maps API 활용 인증 |

---

## 5. 챗봇 기능 상세

| 항목 | 설명 |
|------|------|
| 목적 | 고객센터 자동화, FAQ 응답 |
| API | OpenAI GPT API 사용 |
| 제공 기능 | - 게시글 등록 안내<br>- 거래 주의사항<br>- 계정 오류 처리<br>- 챗 재연결 안내 |
| 위치 | 우측 하단 플로팅버튼 또는 마이페이지 → 고객센터 |

---

## 6. 디렉토리 구조

```bash
## 🗃 디렉토리 구조

```bash
Danggeun/
├── .gradle/
├── .idea/
│   ├── dataSources/
│   ├── shelf/
│   ├── compiler.xml
│   ├── dataSources.local.xml
│   ├── dataSources.xml
│   ├── encodings.xml
│   ├── jarRepositories.xml
│   ├── misc.xml
│   ├── vcs.xml
│   └── workspace.xml
├── .mvn/
│   └── wrapper/
│       └── maven-wrapper.properties
├── db/
│   └── danggeun_dump.sql
├── src/
│   ├── main/
│   │   ├── java/org.example.danggeun/
│   │   │   ├── address.entity/
│   │   │   ├── areaConfirm/
│   │   │   │   ├── Controller/
│   │   │   │   ├── Dto/
│   │   │   │   ├── entity/
│   │   │   │   ├── repository/
│   │   │   │   └── service/
│   │   │   ├── category/
│   │   │   ├── chat.entity/
│   │   │   ├── common/
│   │   │   ├── config/
│   │   │   ├── item.dto/
│   │   │   ├── mainpage.controller/
│   │   │   ├── message.entity/
│   │   │   ├── s3/
│   │   │   ├── search.controller/
│   │   │   ├── security/
│   │   │   ├── trade/
│   │   │   │   ├── controller/
│   │   │   │   ├── dto/
│   │   │   │   ├── entity/
│   │   │   │   ├── repository/
│   │   │   │   └── service/
│   │   │   ├── user/
│   │   │   │   ├── controller/
│   │   │   │   ├── dto/
│   │   │   │   ├── entity/
│   │   │   │   ├── repository/
│   │   │   │   └── service/
│   │   │   ├── write/
│   │   │   └── DanggeunApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── asset/
│   │       │   ├── css/
│   │       │   │   ├── header/
│   │       │   │   ├── login/
│   │       │   │   ├── mainpage/
│   │       │   │   ├── search/
│   │       │   │   └── trade/
│   │       │   ├── images/
│   │       │   ├── js/
│   │       │   └── uploads/
│   │       └── templates/
│   │           ├── areaConfirm/
│   │           ├── fragments/
│   │           ├── login/
│   │           ├── mainPage/
│   │           ├── search/
│   │           └── trade/
│   ├── test/
│   │   └── java/org.example.danggeun/
│   │       └── DanggeunApplicationTests.java
├── target/
├── uploads/
├── .gitattributes
├── .gitignore
├── danggeun_dump.sql
├── mvnw
├── mvnw.cmd
├── pom.xml
├── README.md
└── setup_db.sh
```
---

## 7. 브랜치 전략 및 코드 컨벤션

### 브랜치 정책

| 브랜치명 | 설명 |
|----------|------|
| main | 배포용 브랜치 |
| 이름별 브랜치 (예: minhyung) | 기능별 개발 진행 |
| feature/기능명 | 특정 기능 단위 작업 (선택) |

- 병합은 Pull Request 기반
- 코드 리뷰 후 병합
- 미완성 코드 main에 병합 ❌

### 코드 컨벤션 요약

- 문자열: 쌍따옴표 `"` 사용
- 문장 끝에 세미콜론 `;` 필수
- 들여쓰기: 4칸 space
- 변수/함수: camelCase, 클래스: PascalCase
- 상수: UPPER_SNAKE_CASE
- 연산자/콤마 사이 공백 사용
- 불필요한 줄바꿈/압축 금지

> 📄 자세한 컨벤션은 Notion `Code Convention` 페이지 참고

---

## 8. 기대 효과

- 실무에 가까운 아키텍처 설계 및 기능 구현
- 챗봇 기능 통한 **AI 연동 경험 확보**
- 사용자 중심 서비스 설계 및 기술 적용 경험
- Git 기반 협업 및 코드리뷰 문화 경험

---
