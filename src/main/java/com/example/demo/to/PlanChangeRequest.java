package com.example.demo.to;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PlanChangeRequest {

    @Schema(description = "Abrangência", example = "Nacional")
    private String scope;

    @Schema(description = "Código do plano antigo", example = "123")
    private String oldPlanCode;

    @Schema(description = "Código do plano novo", example = "456")
    private String newPlanCode;

    @Schema(description = "Código do usuário", example = "789")
    private String userCode;

    @Schema(description = "Data limite de envio", example = "2024-12-31")
    private String submissionDeadlineDate;

    @Schema(description = "Data de migração", example = "2024-01-01")
    private String migrationDate;

    @Schema(description = "Data de movimento", example = "2024-02-01")
    private String movementDate;

    @Schema(description = "Forma de agrupamento de movimentações", example = "Mensal")
    private String movementGroupingForm;

    @Schema(description = "Forma de fechamento do lote", example = "Automático")
    private String batchClosureForm;

    @Schema(description = "Forma de validação de críticas", example = "Completa")
    private String criticismValidationForm;

    @Schema(description = "Número do associado ou número da carteira do titular", example = "123456")
    private String associateOrHolderWalletNumber;

    @Schema(description = "Número do contrato", example = "789012345")
    private String contractNumber;

    @Schema(description = "Referência de movimentação", example = "2024-08")
    private String movementReference;

    @Schema(description = "Tipo de operação", example = "Troca de plano")
    private String operationType;
}
