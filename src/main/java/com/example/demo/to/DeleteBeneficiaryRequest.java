package com.example.demo.to;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DeleteBeneficiaryRequest {

    @Schema(description = "Código da empresa", example = "001")
    private String companyCode;

    @Schema(description = "Código do grupo da empresa", example = "002")
    private String companyGroupCode;

    @Schema(description = "Código do motivo de exclusão", example = "003")
    private String exclusionReasonCode;

    @Schema(description = "Código da situação de movimentação", example = "004")
    private String movementSituationCode;

    @Schema(description = "Código do tipo de layout", example = "005")
    private String layoutTypeCode;

    @Schema(description = "Código TS", example = "006")
    private String tsCode;

    @Schema(description = "Código do contrato TS", example = "007")
    private String tsContractCode;

    @Schema(description = "Código TS Dental", example = "008")
    private String tsDentalCode;

    @Schema(description = "Código do usuário", example = "009")
    private String userCode;

    @Schema(description = "Contribuinte", example = "true")
    private boolean contributor;

    @Schema(description = "Data de exclusão", example = "2024-01-01")
    private String exclusionDate;

    @Schema(description = "Data de movimento", example = "2024-02-02")
    private String movementDate;

    @Schema(description = "Emite comprovante", example = "true")
    private boolean issueCertificate;

    @Schema(description = "Forma de agrupamento de movimentações", example = "Mensal")
    private String movementGroupingForm;

    @Schema(description = "Forma de fechamento do lote", example = "Automático")
    private String batchClosureForm;

    @Schema(description = "Forma de validação de críticas", example = "Completa")
    private String criticismValidationForm;

    @Schema(description = "Movimenta dental", example = "true")
    private boolean dentalMovement;

    @Schema(description = "Nome do associado", example = "João da Silva")
    private String associateName;

    @Schema(description = "Número do associado ou número da carteira", example = "123456")
    private String associateOrWalletNumber;

    @Schema(description = "Número do contrato", example = "789012345")
    private String contractNumber;

    @Schema(description = "Número sequencial do lote", example = "567890")
    private String batchSequentialNumber;

    @Schema(description = "Referência de movimentação", example = "2024-08")
    private String movementReference;

    @Schema(description = "Sequencial de movimentação", example = "345678")
    private String movementSequentialNumber;

    @Schema(description = "Tipo de associado", example = "Dependente")
    private String associateType;

    @Schema(description = "Tipo de operação", example = "Exclusão")
    private String operationType;

    @Schema(description = "Valor da multa", example = "100.00")
    private String fineValue;
}

