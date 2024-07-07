package com.example.demo.client;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BeneficiaryClientRequest {
    @JsonProperty("altura")
    private String height;

    @JsonProperty("codigoAgenciaReembolso")
    private String agencyCode;

    @JsonProperty("codigoBairro")
    private String neighborhoodCode;

    @JsonProperty("codigoBancoReembolso")
    private String bankCode;

    @JsonProperty("codigoBrasileiroDeOcupacao")
    private String occupationCode;

    @JsonProperty("codigoEmpresa")
    private String companyCode;

    @JsonProperty("codigoGrupoEmpresa")
    private String companyGroupCode;

    @JsonProperty("codigoLocalTrabalho")
    private String workplaceCode;

    @JsonProperty("codigoLocalTS")
    private String tsLocalCode;

    @JsonProperty("codigoLotacao")
    private String allocationCode;

    @JsonProperty("codigoLotacaoTS")
    private String tsAllocationCode;

    @JsonProperty("codigoMunicipio")
    private String municipalityCode;

    @JsonProperty("codigoMunicipioAtendimento")
    private String serviceMunicipalityCode;

    @JsonProperty("codigoMunicipioNaturalidade")
    private String birthMunicipalityCode;

    @JsonProperty("codigoMunicipioResidencia")
    private String residenceMunicipalityCode;

    @JsonProperty("codigoOrgaoEmissor")
    private String issuingBodyCode;

    @JsonProperty("codigoPais")
    private String countryCode;

    @JsonProperty("codigoPaisEmissor")
    private String issuingCountryCode;

    @JsonProperty("codigoPlano")
    private String planCode;

    @JsonProperty("codigoPlanoOrigem")
    private String originPlanCode;

    @JsonProperty("codigoSituacaoMovimentacao")
    private String movementSituationCode;

    @JsonProperty("codigoTipoLayout")
    private String layoutTypeCode;

    @JsonProperty("codigoTipoLogradouro")
    private String addressTypeCode;

    @JsonProperty("codigoTipoOperacao")
    private String operationTypeCode;

    @JsonProperty("codigoTipoProduto")
    private String productTypeCode;

    @JsonProperty("codigoUsuario")
    private String userCode;

    @JsonProperty("complementoEndereco")
    private String addressComplement;

    @JsonProperty("dataAdmissao")
    private String admissionDate;

    @JsonProperty("dataCasamento")
    private String marriageDate;

    @JsonProperty("dataEmissaoIdentidade")
    private String identityIssuanceDate;

    @JsonProperty("dataInclusao")
    private String inclusionDate;

    @JsonProperty("dataInicioContribuicao")
    private String contributionStartDate;

    @JsonProperty("dataLotacao")
    private String allocationDate;

    @JsonProperty("dataNascimento")
    private String birthDate;

    @JsonProperty("dddCelular")
    private String cellphoneAreaCode;

    @JsonProperty("diaVencimento")
    private String dueDay;

    @JsonProperty("enderecoDeCobranca")
    private boolean billingAddress;

    @JsonProperty("enderecoDeCorrespondencia")
    private boolean correspondenceAddress;

    @JsonProperty("enderecoEmail")
    private String emailAddress;

    @JsonProperty("enderecoResidencial")
    private boolean residentialAddress;

    @JsonProperty("estadoCivil")
    private String maritalStatus;

    @JsonProperty("excluirEndereco")
    private boolean excludeAddress;

    @JsonProperty("mesAnoReferencia")
    private String referenceMonthYear;

    @JsonProperty("nacionalidade")
    private String nationality;

    @JsonProperty("nomeAssociado")
    private String associateName;

    @JsonProperty("tipoAssociado")
    private String associateType;

    @JsonProperty("tipoOperacao")
    private String operationType;

    @JsonProperty("nomeBairro")
    private String neighborhoodName;

    @JsonProperty("nomeCartao")
    private String cardName;

    @JsonProperty("nomeCidade")
    private String cityName;

    @JsonProperty("nomeLogradouro")
    private String addressName;

    @JsonProperty("nomeMae")
    private String motherName;

    @JsonProperty("nomePai")
    private String fatherName;

    @JsonProperty("numeroAssociadoNaOrigem")
    private String originAssociateNumber;

    @JsonProperty("numeroAssociadoOperadora")
    private String operatorAssociateNumber;

    @JsonProperty("numeroAssociadoOuNumeroCarteira")
    private String associateOrWalletNumber;

    @JsonProperty("numeroCelular")
    private String cellphoneNumber;

    @JsonProperty("numeroCEP")
    private String zipCode;

    @JsonProperty("numeroContaCorrenteReembolso")
    private String reimbursementAccountNumber;

    @JsonProperty("numeroContrato")
    private String contractNumber;

    @JsonProperty("numeroCPF")
    private String cpfNumber;

    @JsonProperty("numeroDddTelefone")
    private String phoneAreaCode;

    @JsonProperty("numeroDeclaracaoNascidoVivo")
    private String liveBirthDeclarationNumber;

    @JsonProperty("numeroDigitoAgenciaReembolso")
    private String reimbursementAgencyDigit;

    @JsonProperty("numeroDigitoContaReembolso")
    private String reimbursementAccountDigit;

    @JsonProperty("numeroEndereco")
    private String addressNumber;

    @JsonProperty("numeroIdentidade")
    private String identityNumber;

    @JsonProperty("numeroMatriculaInstituidor")
    private String founderRegistrationNumber;

    @JsonProperty("numeroMatriculaNaEmpresa")
    private String companyRegistrationNumber;

    @JsonProperty("numeroNovaMatriculaNaEmpresa")
    private String newCompanyRegistrationNumber;

    @JsonProperty("numeroPIS")
    private String pisNumber;

    @JsonProperty("numeroProdOpeOrigPortabilidade")
    private String portabilityOriginProductNumber;

    @JsonProperty("numeroProdutoOperadoaraOrigem")
    private String originOperatorProductNumber;

    @JsonProperty("numeroRamal")
    private String extensionNumber;

    @JsonProperty("numeroSequencialLote")
    private String batchSequentialNumber;

    @JsonProperty("numeroSequencialMatricula")
    private String registrationSequentialNumber;

    @JsonProperty("numeroSequencialMovimentacao")
    private String movementSequentialNumber;

    @JsonProperty("numeroTelefone")
    private String phoneNumber;

    @JsonProperty("numeroUnicoSaude")
    private String uniqueHealthNumber;

    @JsonProperty("peso")
    private String weight;

    @JsonProperty("sexo")
    private String gender;

    @JsonProperty("siglaUF")
    private String stateInitials;

    @JsonProperty("situacaoNaEmpresa")
    private String companySituation;

    @JsonProperty("viveNoExterior")
    private boolean livesAbroad;

    @JsonProperty("formaAgrupamentoMovimentacoes")
    private String movementGroupingForm;

    @JsonProperty("codigoGrupoCarencia")
    private String graceGroupCode;

    @JsonProperty("numeroAssociado")
    private String associateNumber;

    @JsonProperty("codigoDependencia")
    private String dependencyCode;

    @JsonProperty("ehAdministradora")
    private boolean isAdministrator;

    @JsonProperty("isObrigaDeclaracaoSaude")
    private boolean requiresHealthDeclaration;

    @JsonProperty("numeroAssociadoTitular")
    private String holderAssociateNumber;

    @JsonProperty("codigoMotivoExclusao")
    private String exclusionReasonCode;

    @JsonProperty("codigoTS")
    private String tsCode;

    @JsonProperty("codigoTSContrato")
    private String tsContractCode;

    @JsonProperty("codigoTsDental")
    private String tsDentalCode;

    @JsonProperty("contrinutario")
    private boolean contributor;

    @JsonProperty("dataExclusao")
    private String exclusionDate;

    @JsonProperty("dataMovimento")
    private String movementDate;

    @JsonProperty("emiteComprovante")
    private boolean issueCertificate;

    @JsonProperty("movimentaDental")
    private boolean dentalMovement;

    @JsonProperty("valorMulta")
    private String fineValue;

    @JsonProperty("abrangencia")
    private String scope;

    @JsonProperty("codigoPlanoAntigo")
    private String oldPlanCode;

    @JsonProperty("codigoPlanoNovo")
    private String newPlanCode;

    @JsonProperty("dataLimiteEnvio")
    private String submissionDeadlineDate;

    @JsonProperty("dataMigracao")
    private String migrationDate;

    @JsonProperty("numeroAssociadoOuNumeroCarteiraTitular")
    private String associateOrHolderWalletNumber;

    @JsonProperty("carenciaParcialTemporariaOrigem")
    private boolean temporaryPartialGraceOrigin;

    @JsonProperty("codigoCargo")
    private String jobPositionCode;

    @JsonProperty("codigoOperadoraOrigem")
    private String originOperatorCode;

    @JsonProperty("codigoTipoCobranca")
    private String billingTypeCode;

    @JsonProperty("codigoTSTitular")
    private String tsHolderCode;

    @JsonProperty("codigoUnimedLocalAtendimento")
    private String unimedServiceLocalCode;

    @JsonProperty("codigoUnimedOrigem")
    private String unimedOriginCode;

    @JsonProperty("dataUltimoPagamentoOrigem")
    private String lastPaymentDateOrigin;

    @JsonProperty("exerceuPortabilidadeOrigem")
    private boolean portabilityExercisedOrigin;

    @JsonProperty("formaFechamentoLote")
    private String batchClosureForm;

    @JsonProperty("formaValidacaoCriticas")
    private String criticismValidationForm;

    @JsonProperty("numeroContratoOrigem")
    private String originContractNumber;

    @JsonProperty("numeroAssociadoOuCarteiraTitular")
    private String associateOrWalletHolderNumber;

    @JsonProperty("observacoes")
    private String observations;

    @JsonProperty("possuiPortabilidade")
    private boolean hasPortability;

    @JsonProperty("referenciaMovimentacao")
    private String movementReference;

    @JsonProperty("doencasPreExistentes")
    private List<PreExistingDisease> preExistingDiseases;

    @Data
    @Builder
    public static class PreExistingDisease {
        @JsonProperty("codigoInternacionalDoenca")
        private String diseaseInternationalCode;

        @JsonProperty("nomeDoenca")
        private String diseaseName;

        @JsonProperty("numeroSequencialMovimentacao")
        private String movementSequentialNumber;
    }
}
