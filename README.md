# Spring_practice

## 비즈니스 요구사항과 설계

- 회원
    - 회원을 가입하고 조회할 수 있다.
    - 회원은 일반과 VIP 두가지 등급이 있다.
    - 회원 데이터는 자체 DB를 구축할 수 있고, 외부 시스템과 연동할 수 있다. (미확정)
    - ![스크린샷 2025-05-08 오후 5.41.23.png](../../../../var/folders/2x/sfm6xd9j6c527skqlf8zg0rr0000gn/T/TemporaryItems/NSIRD_screencaptureui_r4GYh5/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202025-05-08%20%EC%98%A4%ED%9B%84%205.41.23.png)
    - ![스크린샷 2025-05-08 오후 5.42.26.png](../../../../var/folders/2x/sfm6xd9j6c527skqlf8zg0rr0000gn/T/TemporaryItems/NSIRD_screencaptureui_N41mb2/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202025-05-08%20%EC%98%A4%ED%9B%84%205.42.26.png)
    
    <br>
      
- 주문과 할인 정책
    - 회원은 상품을 주문할 수 있다.
    - 회원 등급에 따라 할인 정책을 적용할 수 있다.
    - 할인 정책은 모든 VIP는 1000원을 할인해주는 고정 금액 할인을 적용.
    - 할인 정책은 변경 가능성이 높다. 회사의 기본 할인 정책을 아직 정하지 못했고, 오픈 직전까지 고민을 미루고 싶다. 최악의 경우 할인을 적용하지 않을 수 있다.
    - ![스크린샷 2025-05-08 오후 5.44.26.png](../../../../var/folders/2x/sfm6xd9j6c527skqlf8zg0rr0000gn/T/TemporaryItems/NSIRD_screencaptureui_AHpP6X/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202025-05-08%20%EC%98%A4%ED%9B%84%205.44.26.png)
    - ![스크린샷 2025-05-08 오후 5.44.51.png](../../../../var/folders/2x/sfm6xd9j6c527skqlf8zg0rr0000gn/T/TemporaryItems/NSIRD_screencaptureui_vbMQRi/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202025-05-08%20%EC%98%A4%ED%9B%84%205.44.51.png)
    - ![스크린샷 2025-05-08 오후 5.46.23.png](../../../../var/folders/2x/sfm6xd9j6c527skqlf8zg0rr0000gn/T/TemporaryItems/NSIRD_screencaptureui_CzNEcx/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202025-05-08%20%EC%98%A4%ED%9B%84%205.46.23.png)
    - ![스크린샷 2025-05-08 오후 5.47.04.png](../../../../var/folders/2x/sfm6xd9j6c527skqlf8zg0rr0000gn/T/TemporaryItems/NSIRD_screencaptureui_AerIjL/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202025-05-08%20%EC%98%A4%ED%9B%84%205.47.04.png)
    - ![스크린샷 2025-05-08 오후 5.47.21.png](../../../../var/folders/2x/sfm6xd9j6c527skqlf8zg0rr0000gn/T/TemporaryItems/NSIRD_screencaptureui_CEAfSH/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202025-05-08%20%EC%98%A4%ED%9B%84%205.47.21.png)