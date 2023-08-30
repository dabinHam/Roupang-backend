package com.teamsupercat.roupangbackend.dto.point;

import com.teamsupercat.roupangbackend.entity.Member;
import com.teamsupercat.roupangbackend.entity.Payment;
import com.teamsupercat.roupangbackend.entity.PaymentMethod;
import lombok.*;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PointTransactionDto {

    private Member member;
    private Integer memberIdx;
    private String email;

    private Payment payment;
    private Integer paymentIdx;

    private PaymentMethod paymentMethod;
    private Integer paymentMethodIdx;
    private String transactionType;
    private Long transactionAmount;
    private Instant transactionDate;
    private Long remainingPoints;
    private Long chargePoint;

    @ToString
    @Builder
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ChargePointPrepareRequest {

        // 주문번호 (날짜 + email을 숫자로 변경 )
        private String merchant_uid;

        // 결제 예정금액
        private Long amount;
    }


    @ToString
    @Builder
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ChargePointRequest {
        // 결제 금액
        private Long paymentAmount;

        // 충전할 포인트
        private Long chargePoint;
    }




}
