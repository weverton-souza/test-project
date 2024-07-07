package com.example.demo.to;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import java.util.List;
import lombok.NoArgsConstructor;

@Data
@Builder
public class UpdateBeneficiaryRequest {

    @Schema(description = "Altura", example = "180")
    private String height;

    @Schema(description = "Carência parcial temporária de origem", example = "true")
    private boolean temporaryPartialGraceOrigin;

    @Schema(description = "Código da agência de reembolso", example = "123")
    private String agencyCode;

    @Schema(description = "Código do bairro", example = "456")
    private String neighborhoodCode;

    @Schema(description = "Código do banco de reembolso", example = "789")
    private String bankCode;

    @Schema(description = "Código brasileiro de ocupação", example = "001")
    private String occupationCode;

    @Schema(description = "Código do cargo", example = "002")
    private String jobPositionCode;

    @Schema(description = "Código de dependência", example = "003")
    private String dependencyCode;

    @Schema(description = "Código da empresa", example = "004")
    private String companyCode;

    @Schema(description = "Código do grupo da empresa", example = "005")
    private String companyGroupCode;

    @Schema(description = "Código do local de trabalho", example = "006")
    private String workplaceCode;

    @Schema(description = "Código do local TS", example = "007")
    private String tsLocalCode;

    @Schema(description = "Código de lotação", example = "008")
    private String allocationCode;

    @Schema(description = "Código de lotação TS", example = "009")
    private String tsAllocationCode;

    @Schema(description = "Código do município", example = "010")
    private String municipalityCode;

    @Schema(description = "Código do município de atendimento", example = "011")
    private String serviceMunicipalityCode;

    @Schema(description = "Código do município de naturalidade", example = "012")
    private String birthMunicipalityCode;

    @Schema(description = "Código do município de residência", example = "013")
    private String residenceMunicipalityCode;

    @Schema(description = "Código da operadora de origem", example = "014")
    private String originOperatorCode;

    @Schema(description = "Código do órgão emissor", example = "015")
    private String issuingBodyCode;

    @Schema(description = "Código do país", example = "016")
    private String countryCode;

    @Schema(description = "Código do país emissor", example = "017")
    private String issuingCountryCode;

    @Schema(description = "Código do plano", example = "018")
    private String planCode;

    @Schema(description = "Código do plano de origem", example = "019")
    private String originPlanCode;

    @Schema(description = "Código da situação de movimentação", example = "020")
    private String movementSituationCode;

    @Schema(description = "Código do tipo de cobrança", example = "021")
    private String billingTypeCode;

    @Schema(description = "Código do tipo de layout", example = "022")
    private String layoutTypeCode;

    @Schema(description = "Código do tipo de logradouro", example = "023")
    private String addressTypeCode;

    @Schema(description = "Código TS", example = "024")
    private String tsCode;

    @Schema(description = "Código do contrato TS", example = "025")
    private String tsContractCode;

    @Schema(description = "Código do titular TS", example = "026")
    private String tsHolderCode;

    @Schema(description = "Código da Unimed local de atendimento", example = "027")
    private String unimedServiceLocalCode;

    @Schema(description = "Código da Unimed de origem", example = "028")
    private String unimedOriginCode;

    @Schema(description = "Código do usuário", example = "029")
    private String userCode;

    @Schema(description = "Complemento do endereço", example = "Apto 101")
    private String addressComplement;

    @Schema(description = "Data de admissão", example = "2024-01-01")
    private String admissionDate;

    @Schema(description = "Data de casamento", example = "2024-02-02")
    private String marriageDate;

    @Schema(description = "Data de emissão da identidade", example = "2024-03-03")
    private String identityIssuanceDate;

    @Schema(description = "Data de inclusão", example = "2024-04-04")
    private String inclusionDate;

    @Schema(description = "Data de início da contribuição", example = "2024-05-05")
    private String contributionStartDate;

    @Schema(description = "Data de lotação", example = "2024-06-06")
    private String allocationDate;

    @Schema(description = "Data de movimento", example = "2024-07-07")
    private String movementDate;

    @Schema(description = "Data de nascimento", example = "2024-08-08")
    private String birthDate;

    @Schema(description = "Data do último pagamento de origem", example = "2024-09-09")
    private String lastPaymentDateOrigin;

    @Schema(description = "DDD do celular", example = "11")
    private String cellphoneAreaCode;

    @Schema(description = "Dia de vencimento", example = "15")
    private String dueDay;

    @Schema(description = "Endereço de cobrança", example = "true")
    private boolean billingAddress;

    @Schema(description = "Endereço de correspondência", example = "true")
    private boolean correspondenceAddress;

    @Schema(description = "Endereço de e-mail", example = "email@example.com")
    private String emailAddress;

    @Schema(description = "Endereço residencial", example = "true")
    private boolean residentialAddress;//50

    @Schema(description = "Estado civil", example = "Solteiro")
    private String maritalStatus;

    @Schema(description = "Excluir endereço", example = "true")
    private boolean excludeAddress;

    @Schema(description = "Exerceu portabilidade de origem", example = "true")
    private boolean portabilityExercisedOrigin;

    @Schema(description = "Forma de agrupamento de movimentações", example = "Mensal")
    private String movementGroupingForm;

    @Schema(description = "Forma de fechamento do lote", example = "Automático")
    private String batchClosureForm;

    @Schema(description = "Forma de validação de críticas", example = "Completa")
    private String criticismValidationForm;

    @Schema(description = "Nacionalidade", example = "Brasileira")
    private String nationality;

    @Schema(description = "Nome do associado", example = "João da Silva")
    private String associateName;

    @Schema(description = "Nome do bairro", example = "Centro")
    private String neighborhoodName;

    @Schema(description = "Nome do cartão", example = "João da Silva")
    private String cardName;

    @Schema(description = "Nome da cidade", example = "São Paulo")
    private String cityName;

    @Schema(description = "Nome do logradouro", example = "Rua A")
    private String addressName;

    @Schema(description = "Nome da mãe", example = "Maria da Silva")
    private String motherName;

    @Schema(description = "Nome do pai", example = "José da Silva")
    private String fatherName;

    @Schema(description = "Número do associado na origem", example = "654321")
    private String originAssociateNumber;

    @Schema(description = "Número do associado da operadora", example = "789012")
    private String operatorAssociateNumber;

    @Schema(description = "Número do associado ou carteira titular", example = "345678")
    private String associateOrWalletHolderNumber;

    @Schema(description = "Número do associado ou número da carteira", example = "123456")
    private String associateOrWalletNumber;

    @Schema(description = "Número do celular", example = "987654321")
    private String cellphoneNumber;

    @Schema(description = "Número do CEP", example = "01000-000")
    private String zipCode;

    @Schema(description = "Número da conta corrente de reembolso", example = "12345-6")
    private String reimbursementAccountNumber;

    @Schema(description = "Número do contrato", example = "789012345")
    private String contractNumber;

    @Schema(description = "Número do contrato de origem", example = "987654321")
    private String originContractNumber;

    @Schema(description = "Número do CPF", example = "123.456.789-00")
    private String cpfNumber;

    @Schema(description = "Número do DDD do telefone", example = "11")
    private String phoneAreaCode;

    @Schema(description = "Número da declaração de nascido vivo", example = "1234567890")
    private String liveBirthDeclarationNumber;

    @Schema(description = "Número do dígito da agência de reembolso", example = "7")
    private String reimbursementAgencyDigit;

    @Schema(description = "Número do dígito da conta de reembolso", example = "8")
    private String reimbursementAccountDigit;

    @Schema(description = "Número do endereço", example = "123")
    private String addressNumber;

    @Schema(description = "Número da identidade", example = "123456789")
    private String identityNumber;

    @Schema(description = "Número da matrícula do instituidor", example = "987654")
    private String founderRegistrationNumber;

    @Schema(description = "Número da matrícula na empresa", example = "654321")
    private String companyRegistrationNumber;

    @Schema(description = "Número da nova matrícula na empresa", example = "321654")
    private String newCompanyRegistrationNumber;

    @Schema(description = "Número do PIS", example = "123.45678.90-1")
    private String pisNumber;

    @Schema(description = "Número do produto de origem da portabilidade", example = "456789")
    private String portabilityOriginProductNumber;

    @Schema(description = "Número do produto da operadora de origem", example = "987654")
    private String originOperatorProductNumber;

    @Schema(description = "Número do ramal", example = "1234")
    private String extensionNumber;

    @Schema(description = "Número sequencial do lote", example = "567890")
    private String batchSequentialNumber;

    @Schema(description = "Número sequencial da matrícula", example = "234567")
    private String registrationSequentialNumber;

    @Schema(description = "Número do telefone", example = "123456789")
    private String phoneNumber;

    @Schema(description = "Número único de saúde", example = "987654321")
    private String uniqueHealthNumber;

    @Schema(description = "Observações", example = "Nenhuma")
    private String observations;

    @Schema(description = "Peso", example = "70")
    private String weight;

    @Schema(description = "Possui portabilidade", example = "true")
    private boolean hasPortability;

    @Schema(description = "Referência de movimentação", example = "2024-08")
    private String movementReference;

    @Schema(description = "Sequencial de movimentação", example = "345678")
    private String movementSequentialNumber;

    @Schema(description = "Sexo", example = "Masculino")
    private String gender;

    @Schema(description = "Sigla da UF", example = "SP")
    private String stateInitials;

    @Schema(description = "Situação na empresa", example = "Ativo")
    private String companySituation;

    @Schema(description = "Tipo de associado", example = "Dependente")
    private String associateType;//50

    @Schema(description = "Tipo de operação", example = "Inclusão")
    private String operationType;

    @Schema(description = "Vive no exterior", example = "true")
    private boolean livesAbroad;

    @Schema(description = "Doenças preexistentes")
    private List<PreExistingDisease> preExistingDiseases;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class PreExistingDisease {
        @Schema(description = "Código internacional da doença", example = "A00")
        private String diseaseInternationalCode;

        @Schema(description = "Nome da doença", example = "Cólera")
        private String diseaseName;

        @Schema(description = "Número sequencial de movimentação", example = "123456")
        private String movementSequentialNumber;
    }
}

