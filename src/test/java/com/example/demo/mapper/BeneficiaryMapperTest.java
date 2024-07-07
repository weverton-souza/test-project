package com.example.demo.mapper;

import com.example.demo.client.BeneficiaryClientRequest;
import com.example.demo.to.CreateBeneficiaryRequest;
import com.example.demo.to.CreateDependentRequest;
import com.example.demo.to.DeleteBeneficiaryRequest;
import com.example.demo.to.PlanChangeRequest;
import com.example.demo.to.UpdateBeneficiaryRequest;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Test Beneficiary Mapper")
public class BeneficiaryMapperTest {

    private static final String URL_JSON_FOLDER = "src/test/resources/json/";

    @Test
    @DisplayName("Test conversion of CreateBeneficiaryRequest to BeneficiaryClientRequest")
    public void testConvertCreateBeneficiaryRequest() {
        // Arrange
        CreateBeneficiaryRequest request = buildCreateBeneficiaryRequest();

        // Act
        BeneficiaryClientRequest beneficiaryClientRequest = BeneficiaryMapper.convert(request);

        // Assert
        assertEquals(request.getAgencyCode(), beneficiaryClientRequest.getAgencyCode());
        assertEquals(request.getNeighborhoodCode(), beneficiaryClientRequest.getNeighborhoodCode());
        assertEquals(request.getBankCode(), beneficiaryClientRequest.getBankCode());
        assertEquals(request.getOccupationCode(), beneficiaryClientRequest.getOccupationCode());
        assertEquals(request.getCompanyCode(), beneficiaryClientRequest.getCompanyCode());
        assertEquals(request.getGraceGroupCode(), beneficiaryClientRequest.getGraceGroupCode());
        assertEquals(request.getCompanyGroupCode(), beneficiaryClientRequest.getCompanyGroupCode());
        assertEquals(request.getWorkplaceCode(), beneficiaryClientRequest.getWorkplaceCode());
        assertEquals(request.getTsLocalCode(), beneficiaryClientRequest.getTsLocalCode());
        assertEquals(request.getAllocationCode(), beneficiaryClientRequest.getAllocationCode());
        assertEquals(request.getTsAllocationCode(), beneficiaryClientRequest.getTsAllocationCode());
        assertEquals(request.getMunicipalityCode(), beneficiaryClientRequest.getMunicipalityCode());
        assertEquals(request.getServiceMunicipalityCode(), beneficiaryClientRequest.getServiceMunicipalityCode());
        assertEquals(request.getBirthMunicipalityCode(), beneficiaryClientRequest.getBirthMunicipalityCode());
        assertEquals(request.getResidenceMunicipalityCode(), beneficiaryClientRequest.getResidenceMunicipalityCode());
        assertEquals(request.getIssuingBodyCode(), beneficiaryClientRequest.getIssuingBodyCode());
        assertEquals(request.getCountryCode(), beneficiaryClientRequest.getCountryCode());
        assertEquals(request.getIssuingCountryCode(), beneficiaryClientRequest.getIssuingCountryCode());
        assertEquals(request.getPlanCode(), beneficiaryClientRequest.getPlanCode());
        assertEquals(request.getOriginPlanCode(), beneficiaryClientRequest.getOriginPlanCode());
        assertEquals(request.getMovementSituationCode(), beneficiaryClientRequest.getMovementSituationCode());
        assertEquals(request.getLayoutTypeCode(), beneficiaryClientRequest.getLayoutTypeCode());
        assertEquals(request.getAddressTypeCode(), beneficiaryClientRequest.getAddressTypeCode());
        assertEquals(request.getOperationTypeCode(), beneficiaryClientRequest.getOperationTypeCode());
        assertEquals(request.getProductTypeCode(), beneficiaryClientRequest.getProductTypeCode());
        assertEquals(request.getUserCode(), beneficiaryClientRequest.getUserCode());
        assertEquals(request.getAddressComplement(), beneficiaryClientRequest.getAddressComplement());
        assertEquals(request.getAdmissionDate(), beneficiaryClientRequest.getAdmissionDate());
        assertEquals(request.getMarriageDate(), beneficiaryClientRequest.getMarriageDate());
        assertEquals(request.getIdentityIssuanceDate(), beneficiaryClientRequest.getIdentityIssuanceDate());
        assertEquals(request.getInclusionDate(), beneficiaryClientRequest.getInclusionDate());
        assertEquals(request.getContributionStartDate(), beneficiaryClientRequest.getContributionStartDate());
        assertEquals(request.getAllocationDate(), beneficiaryClientRequest.getAllocationDate());
        assertEquals(request.getBirthDate(), beneficiaryClientRequest.getBirthDate());
        assertEquals(request.getCellphoneAreaCode(), beneficiaryClientRequest.getCellphoneAreaCode());
        assertEquals(request.getDueDay(), beneficiaryClientRequest.getDueDay());
        assertTrue(beneficiaryClientRequest.isBillingAddress());
        assertTrue(beneficiaryClientRequest.isCorrespondenceAddress());
        assertEquals(request.getEmailAddress(), beneficiaryClientRequest.getEmailAddress());
        assertTrue(beneficiaryClientRequest.isResidentialAddress());
        assertEquals(request.getMaritalStatus(), beneficiaryClientRequest.getMaritalStatus());
        assertFalse(beneficiaryClientRequest.isExcludeAddress());
        assertEquals(request.getReferenceMonthYear(), beneficiaryClientRequest.getReferenceMonthYear());
        assertEquals(request.getNationality(), beneficiaryClientRequest.getNationality());
        assertEquals(request.getAssociateName(), beneficiaryClientRequest.getAssociateName());
        assertEquals(request.getNeighborhoodName(), beneficiaryClientRequest.getNeighborhoodName());
        assertEquals(request.getCardName(), beneficiaryClientRequest.getCardName());
        assertEquals(request.getCityName(), beneficiaryClientRequest.getCityName());
        assertEquals(request.getAddressName(), beneficiaryClientRequest.getAddressName());
        assertEquals(request.getMotherName(), beneficiaryClientRequest.getMotherName());
        assertEquals(request.getFatherName(), beneficiaryClientRequest.getFatherName());
        assertEquals(request.getAssociateNumber(), beneficiaryClientRequest.getAssociateNumber());
        assertEquals(request.getOriginAssociateNumber(), beneficiaryClientRequest.getOriginAssociateNumber());
        assertEquals(request.getOperatorAssociateNumber(), beneficiaryClientRequest.getOperatorAssociateNumber());
        assertEquals(request.getAssociateOrWalletNumber(), beneficiaryClientRequest.getAssociateOrWalletNumber());
        assertEquals(request.getCellphoneNumber(), beneficiaryClientRequest.getCellphoneNumber());
        assertEquals(request.getZipCode(), beneficiaryClientRequest.getZipCode());
        assertEquals(request.getReimbursementAccountNumber(), beneficiaryClientRequest.getReimbursementAccountNumber());
        assertEquals(request.getContractNumber(), beneficiaryClientRequest.getContractNumber());
        assertEquals(request.getCpfNumber(), beneficiaryClientRequest.getCpfNumber());
        assertEquals(request.getPhoneAreaCode(), beneficiaryClientRequest.getPhoneAreaCode());
        assertEquals(request.getLiveBirthDeclarationNumber(), beneficiaryClientRequest.getLiveBirthDeclarationNumber());
        assertEquals(request.getReimbursementAgencyDigit(), beneficiaryClientRequest.getReimbursementAgencyDigit());
        assertEquals(request.getReimbursementAccountDigit(), beneficiaryClientRequest.getReimbursementAccountDigit());
        assertEquals(request.getAddressNumber(), beneficiaryClientRequest.getAddressNumber());
        assertEquals(request.getIdentityNumber(), beneficiaryClientRequest.getIdentityNumber());
        assertEquals(request.getFounderRegistrationNumber(), beneficiaryClientRequest.getFounderRegistrationNumber());
        assertEquals(request.getCompanyRegistrationNumber(), beneficiaryClientRequest.getCompanyRegistrationNumber());
        assertEquals(request.getNewCompanyRegistrationNumber(), beneficiaryClientRequest.getNewCompanyRegistrationNumber());
        assertEquals(request.getPisNumber(), beneficiaryClientRequest.getPisNumber());
        assertEquals(request.getPortabilityOriginProductNumber(), beneficiaryClientRequest.getPortabilityOriginProductNumber());
        assertEquals(request.getOriginOperatorProductNumber(), beneficiaryClientRequest.getOriginOperatorProductNumber());
        assertEquals(request.getExtensionNumber(), beneficiaryClientRequest.getExtensionNumber());
        assertEquals(request.getBatchSequentialNumber(), beneficiaryClientRequest.getBatchSequentialNumber());
        assertEquals(request.getRegistrationSequentialNumber(), beneficiaryClientRequest.getRegistrationSequentialNumber());
        assertEquals(request.getMovementSequentialNumber(), beneficiaryClientRequest.getMovementSequentialNumber());
        assertEquals(request.getPhoneNumber(), beneficiaryClientRequest.getPhoneNumber());
        assertEquals(request.getUniqueHealthNumber(), beneficiaryClientRequest.getUniqueHealthNumber());
        assertEquals(request.getWeight(), beneficiaryClientRequest.getWeight());
        assertEquals(request.getGender(), beneficiaryClientRequest.getGender());
        assertEquals(request.getStateInitials(), beneficiaryClientRequest.getStateInitials());
        assertEquals(request.getCompanySituation(), beneficiaryClientRequest.getCompanySituation());
        assertFalse(beneficiaryClientRequest.isLivesAbroad());
    }

    @Test
    @DisplayName("Test JSON conversion for CreateBeneficiaryRequest")
    public void testJsonCreateBeneficiaryRequest() throws IOException {
        // Arrange
        CreateBeneficiaryRequest request = buildCreateBeneficiaryRequest();

        // Act
        BeneficiaryClientRequest beneficiaryClientRequest = BeneficiaryMapper.convert(request);

        ObjectMapper objectMapper = new ObjectMapper();
        String file = new String(
                Files.readAllBytes(
                        Paths.get(URL_JSON_FOLDER + "create-beneficiary-request.json")), StandardCharsets.UTF_8
        );

        JsonNode actualJsonNode = objectMapper.readTree(file);

        // Assert
        assertEquals(beneficiaryClientRequest.getAgencyCode(), actualJsonNode.get("codigoAgenciaReembolso").asText());
        assertEquals(beneficiaryClientRequest.getNeighborhoodCode(), actualJsonNode.get("codigoBairro").asText());
        assertEquals(beneficiaryClientRequest.getBankCode(), actualJsonNode.get("codigoBancoReembolso").asText());
        assertEquals(beneficiaryClientRequest.getOccupationCode(), actualJsonNode.get("codigoBrasileiroDeOcupacao").asText());
        assertEquals(beneficiaryClientRequest.getCompanyCode(), actualJsonNode.get("codigoEmpresa").asText());
        assertEquals(beneficiaryClientRequest.getWorkplaceCode(), actualJsonNode.get("codigoLocalTrabalho").asText());
        assertEquals(beneficiaryClientRequest.getTsLocalCode(), actualJsonNode.get("codigoLocalTS").asText());
        assertEquals(beneficiaryClientRequest.getAllocationCode(), actualJsonNode.get("codigoLotacao").asText());
        assertEquals(beneficiaryClientRequest.getTsAllocationCode(), actualJsonNode.get("codigoLotacaoTS").asText());
        assertEquals(beneficiaryClientRequest.getMunicipalityCode(), actualJsonNode.get("codigoMunicipio").asText());
        assertEquals(beneficiaryClientRequest.getServiceMunicipalityCode(), actualJsonNode.get("codigoMunicipioAtendimento").asText());
        assertEquals(beneficiaryClientRequest.getBirthMunicipalityCode(), actualJsonNode.get("codigoMunicipioNaturalidade").asText());
        assertEquals(beneficiaryClientRequest.getResidenceMunicipalityCode(), actualJsonNode.get("codigoMunicipioResidencia").asText());
        assertEquals(beneficiaryClientRequest.getIssuingBodyCode(), actualJsonNode.get("codigoOrgaoEmissor").asText());
        assertEquals(beneficiaryClientRequest.getCountryCode(), actualJsonNode.get("codigoPais").asText());
        assertEquals(beneficiaryClientRequest.getIssuingCountryCode(), actualJsonNode.get("codigoPaisEmissor").asText());
        assertEquals(beneficiaryClientRequest.getPlanCode(), actualJsonNode.get("codigoPlano").asText());
        assertEquals(beneficiaryClientRequest.getOriginPlanCode(), actualJsonNode.get("codigoPlanoOrigem").asText());
        assertEquals(beneficiaryClientRequest.getMovementSituationCode(), actualJsonNode.get("codigoSituacaoMovimentacao").asText());
        assertEquals(beneficiaryClientRequest.getLayoutTypeCode(), actualJsonNode.get("codigoTipoLayout").asText());
        assertEquals(beneficiaryClientRequest.getAddressTypeCode(), actualJsonNode.get("codigoTipoLogradouro").asText());
        assertEquals(beneficiaryClientRequest.getOperationTypeCode(), actualJsonNode.get("codigoTipoOperacao").asText());
        assertEquals(beneficiaryClientRequest.getProductTypeCode(), actualJsonNode.get("codigoTipoProduto").asText());
        assertEquals(beneficiaryClientRequest.getUserCode(), actualJsonNode.get("codigoUsuario").asText());
        assertEquals(beneficiaryClientRequest.getAddressComplement(), actualJsonNode.get("complementoEndereco").asText());
        assertEquals(beneficiaryClientRequest.getAdmissionDate(), actualJsonNode.get("dataAdmissao").asText());
        assertEquals(beneficiaryClientRequest.getMarriageDate(), actualJsonNode.get("dataCasamento").asText());
        assertEquals(beneficiaryClientRequest.getIdentityIssuanceDate(), actualJsonNode.get("dataEmissaoIdentidade").asText());
        assertEquals(beneficiaryClientRequest.getInclusionDate(), actualJsonNode.get("dataInclusao").asText());
        assertEquals(beneficiaryClientRequest.getContributionStartDate(), actualJsonNode.get("dataInicioContribuicao").asText());
        assertEquals(beneficiaryClientRequest.getAllocationDate(), actualJsonNode.get("dataLotacao").asText());
        assertEquals(beneficiaryClientRequest.getBirthDate(), actualJsonNode.get("dataNascimento").asText());
        assertEquals(beneficiaryClientRequest.getCellphoneAreaCode(), actualJsonNode.get("dddCelular").asText());
        assertEquals(beneficiaryClientRequest.getDueDay(), actualJsonNode.get("diaVencimento").asText());
        assertEquals(beneficiaryClientRequest.isBillingAddress(), actualJsonNode.get("enderecoDeCobranca").asBoolean());
        assertEquals(beneficiaryClientRequest.isCorrespondenceAddress(), actualJsonNode.get("enderecoDeCorrespondencia").asBoolean());
        assertEquals(beneficiaryClientRequest.getEmailAddress(), actualJsonNode.get("enderecoEmail").asText());
        assertEquals(beneficiaryClientRequest.isResidentialAddress(), actualJsonNode.get("enderecoResidencial").asBoolean());
        assertEquals(beneficiaryClientRequest.getMaritalStatus(), actualJsonNode.get("estadoCivil").asText());
        assertEquals(beneficiaryClientRequest.isExcludeAddress(), actualJsonNode.get("excluirEndereco").asBoolean());
        assertEquals(beneficiaryClientRequest.getReferenceMonthYear(), actualJsonNode.get("mesAnoReferencia").asText());
        assertEquals(beneficiaryClientRequest.getNationality(), actualJsonNode.get("nacionalidade").asText());
        assertEquals(beneficiaryClientRequest.getAssociateName(), actualJsonNode.get("nomeAssociado").asText());
        assertEquals(beneficiaryClientRequest.getCardName(), actualJsonNode.get("nomeCartao").asText());
        assertEquals(beneficiaryClientRequest.getAddressName(), actualJsonNode.get("nomeLogradouro").asText());
        assertEquals(beneficiaryClientRequest.getMotherName(), actualJsonNode.get("nomeMae").asText());
        assertEquals(beneficiaryClientRequest.getFatherName(), actualJsonNode.get("nomePai").asText());
        assertEquals(beneficiaryClientRequest.getZipCode(), actualJsonNode.get("numeroCEP").asText());
        assertEquals(beneficiaryClientRequest.getCpfNumber(), actualJsonNode.get("numeroCPF").asText());
        assertEquals(beneficiaryClientRequest.getCellphoneNumber(), actualJsonNode.get("numeroCelular").asText());
        assertEquals(beneficiaryClientRequest.getContractNumber(), actualJsonNode.get("numeroContrato").asText());
        assertEquals(beneficiaryClientRequest.getPhoneAreaCode(), actualJsonNode.get("numeroDddTelefone").asText());
        assertEquals(beneficiaryClientRequest.getAddressNumber(), actualJsonNode.get("numeroEndereco").asText());
        assertEquals(beneficiaryClientRequest.getIdentityNumber(), actualJsonNode.get("numeroIdentidade").asText());
        assertEquals(beneficiaryClientRequest.getCompanySituation(), actualJsonNode.get("situacaoNaEmpresa").asText());
        assertEquals(beneficiaryClientRequest.getGender(), actualJsonNode.get("sexo").asText());
        assertEquals(beneficiaryClientRequest.getStateInitials(), actualJsonNode.get("siglaUF").asText());
        assertEquals(beneficiaryClientRequest.isLivesAbroad(), actualJsonNode.get("viveNoExterior").asBoolean());
    }

    @Test
    @DisplayName("Test JSON conversion for CreateDependentRequest")
    public void testJsonCreateDependentRequest() throws IOException {
        // Arrange
        CreateDependentRequest request = buildCreateDependentRequest();

        // Act
        BeneficiaryClientRequest beneficiaryClientRequest = BeneficiaryMapper.convert(request);

        ObjectMapper objectMapper = new ObjectMapper();
        String file = new String(
                Files.readAllBytes(
                        Paths.get(URL_JSON_FOLDER + "create-dependent-request.json")), StandardCharsets.UTF_8
        );

        JsonNode actualJsonNode = objectMapper.readTree(file);

        // Assert
        assertEquals(beneficiaryClientRequest.getAgencyCode(), actualJsonNode.get("codigoAgenciaReembolso").asText());
        assertEquals(beneficiaryClientRequest.getNeighborhoodCode(), actualJsonNode.get("codigoBairro").asText());
        assertEquals(beneficiaryClientRequest.getBankCode(), actualJsonNode.get("codigoBancoReembolso").asText());
        assertEquals(beneficiaryClientRequest.getOccupationCode(), actualJsonNode.get("codigoBrasileiroDeOcupacao").asText());
        assertEquals(beneficiaryClientRequest.getDependencyCode(), actualJsonNode.get("codigoDependencia").asText());
        assertEquals(beneficiaryClientRequest.getCompanyCode(), actualJsonNode.get("codigoEmpresa").asText());
        assertEquals(beneficiaryClientRequest.getTsLocalCode(), actualJsonNode.get("codigoLocalTS").asText());
        assertEquals(beneficiaryClientRequest.getAllocationCode(), actualJsonNode.get("codigoLotacao").asText());
        assertEquals(beneficiaryClientRequest.getTsAllocationCode(), actualJsonNode.get("codigoLotacaoTS").asText());
        assertEquals(beneficiaryClientRequest.getMunicipalityCode(), actualJsonNode.get("codigoMunicipio").asText());
        assertEquals(beneficiaryClientRequest.getServiceMunicipalityCode(), actualJsonNode.get("codigoMunicipioAtendimento").asText());
        assertEquals(beneficiaryClientRequest.getBirthMunicipalityCode(), actualJsonNode.get("codigoMunicipioNaturalidade").asText());
        assertEquals(beneficiaryClientRequest.getResidenceMunicipalityCode(), actualJsonNode.get("codigoMunicipioResidencia").asText());
        assertEquals(beneficiaryClientRequest.getIssuingBodyCode(), actualJsonNode.get("codigoOrgaoEmissor").asText());
        assertEquals(beneficiaryClientRequest.getCountryCode(), actualJsonNode.get("codigoPais").asText());
        assertEquals(beneficiaryClientRequest.getIssuingCountryCode(), actualJsonNode.get("codigoPaisEmissor").asText());
        assertEquals(beneficiaryClientRequest.getPlanCode(), actualJsonNode.get("codigoPlano").asText());
        assertEquals(beneficiaryClientRequest.getOriginPlanCode(), actualJsonNode.get("codigoPlanoOrigem").asText());
        assertEquals(beneficiaryClientRequest.getTsHolderCode(), actualJsonNode.get("codigoTSTitular").asText());
        assertEquals(beneficiaryClientRequest.getBillingTypeCode(), actualJsonNode.get("codigoTipoCobranca").asText());
        assertEquals(beneficiaryClientRequest.getAddressTypeCode(), actualJsonNode.get("codigoTipoLogradouro").asText());
        assertEquals(beneficiaryClientRequest.getOperationTypeCode(), actualJsonNode.get("codigoTipoOperacao").asText());
        assertEquals(beneficiaryClientRequest.getAddressComplement(), actualJsonNode.get("complementoEndereco").asText());
        assertEquals(beneficiaryClientRequest.getMarriageDate(), actualJsonNode.get("dataCasamento").asText());
        assertEquals(beneficiaryClientRequest.getIdentityIssuanceDate(), actualJsonNode.get("dataEmissaoIdentidade").asText());
        assertEquals(beneficiaryClientRequest.getInclusionDate(), actualJsonNode.get("dataInclusao").asText());
        assertEquals(beneficiaryClientRequest.getContributionStartDate(), actualJsonNode.get("dataInicioContribuicao").asText());
        assertEquals(beneficiaryClientRequest.getAllocationDate(), actualJsonNode.get("dataLotacao").asText());
        assertEquals(beneficiaryClientRequest.getBirthDate(), actualJsonNode.get("dataNascimento").asText());
        assertEquals(beneficiaryClientRequest.getCellphoneAreaCode(), actualJsonNode.get("dddCelular").asText());
        assertEquals(beneficiaryClientRequest.getDueDay(), actualJsonNode.get("diaVencimento").asText());
        assertEquals(beneficiaryClientRequest.isAdministrator(), actualJsonNode.get("ehAdministradora").asBoolean());
        assertEquals(beneficiaryClientRequest.isBillingAddress(), actualJsonNode.get("enderecoDeCobranca").asBoolean());
        assertEquals(beneficiaryClientRequest.isCorrespondenceAddress(), actualJsonNode.get("enderecoDeCorrespondencia").asBoolean());
        assertEquals(beneficiaryClientRequest.getEmailAddress(), actualJsonNode.get("enderecoEmail").asText());
        assertEquals(beneficiaryClientRequest.isResidentialAddress(), actualJsonNode.get("enderecoResidencial").asBoolean());
        assertEquals(beneficiaryClientRequest.getMaritalStatus(), actualJsonNode.get("estadoCivil").asText());
        assertEquals(beneficiaryClientRequest.isExcludeAddress(), actualJsonNode.get("excluirEndereco").asBoolean());
        assertEquals(beneficiaryClientRequest.isRequiresHealthDeclaration(), actualJsonNode.get("isObrigaDeclaracaoSaude").asBoolean());
        assertEquals(beneficiaryClientRequest.getReferenceMonthYear(), actualJsonNode.get("mesAnoReferencia").asText());
        assertEquals(beneficiaryClientRequest.getNationality(), actualJsonNode.get("nacionalidade").asText());
        assertEquals(beneficiaryClientRequest.getAssociateName(), actualJsonNode.get("nomeAssociado").asText());
        assertEquals(beneficiaryClientRequest.getCardName(), actualJsonNode.get("nomeCartao").asText());
        assertEquals(beneficiaryClientRequest.getAddressName(), actualJsonNode.get("nomeLogradouro").asText());
        assertEquals(beneficiaryClientRequest.getMotherName(), actualJsonNode.get("nomeMae").asText());
        assertEquals(beneficiaryClientRequest.getFatherName(), actualJsonNode.get("nomePai").asText());
        assertEquals(beneficiaryClientRequest.getAssociateOrWalletHolderNumber(), actualJsonNode.get("numeroAssociadoOuCarteiraTitular").asText());
        assertEquals(beneficiaryClientRequest.getHolderAssociateNumber(), actualJsonNode.get("numeroAssociadoTitular").asText());
        assertEquals(beneficiaryClientRequest.getZipCode(), actualJsonNode.get("numeroCEP").asText());
        assertEquals(beneficiaryClientRequest.getCpfNumber(), actualJsonNode.get("numeroCPF").asText());
        assertEquals(beneficiaryClientRequest.getCellphoneNumber(), actualJsonNode.get("numeroCelular").asText());
        assertEquals(beneficiaryClientRequest.getContractNumber(), actualJsonNode.get("numeroContrato").asText());
        assertEquals(beneficiaryClientRequest.getPhoneAreaCode(), actualJsonNode.get("numeroDddTelefone").asText());
        assertEquals(beneficiaryClientRequest.getAddressNumber(), actualJsonNode.get("numeroEndereco").asText());
        assertEquals(beneficiaryClientRequest.getIdentityNumber(), actualJsonNode.get("numeroIdentidade").asText());
        assertEquals(beneficiaryClientRequest.getCompanySituation(), actualJsonNode.get("situacaoNaEmpresa").asText());
        assertEquals(beneficiaryClientRequest.getGender(), actualJsonNode.get("sexo").asText());
        assertEquals(beneficiaryClientRequest.getStateInitials(), actualJsonNode.get("siglaUF").asText());
        assertEquals(beneficiaryClientRequest.isLivesAbroad(), actualJsonNode.get("viveNoExterior").asBoolean());
    }

    @Test
    @DisplayName("Test JSON conversion for UpdateBeneficiaryRequest")
    public void testJsonUpdateBeneficiaryRequest() throws IOException {
        // Arrange
        UpdateBeneficiaryRequest request = buildUpdateBeneficiaryRequest();

        // Act
        BeneficiaryClientRequest beneficiaryClientRequest = BeneficiaryMapper.convert(request);

        ObjectMapper objectMapper = new ObjectMapper();
        String file = new String(
                Files.readAllBytes(
                        Paths.get(URL_JSON_FOLDER + "update-beneficiary-request.json")), StandardCharsets.UTF_8
        );

        JsonNode actualJsonNode = objectMapper.readTree(file);

        // Assert
        assertEquals(beneficiaryClientRequest.getHeight(), actualJsonNode.get("altura").asText());
        assertEquals(beneficiaryClientRequest.isTemporaryPartialGraceOrigin(), actualJsonNode.get("carenciaParcialTemporariaOrigem").asBoolean());
        assertEquals(beneficiaryClientRequest.getAgencyCode(), actualJsonNode.get("codigoAgenciaReembolso").asText());
        assertEquals(beneficiaryClientRequest.getNeighborhoodCode(), actualJsonNode.get("codigoBairro").asText());
        assertEquals(beneficiaryClientRequest.getBankCode(), actualJsonNode.get("codigoBancoReembolso").asText());
        assertEquals(beneficiaryClientRequest.getOccupationCode(), actualJsonNode.get("codigoBrasileiroDeOcupacao").asText());
        assertEquals(beneficiaryClientRequest.getJobPositionCode(), actualJsonNode.get("codigoCargo").asText());
        assertEquals(beneficiaryClientRequest.getDependencyCode(), actualJsonNode.get("codigoDependencia").asText());
        assertEquals(beneficiaryClientRequest.getCompanyCode(), actualJsonNode.get("codigoEmpresa").asText());
        assertEquals(beneficiaryClientRequest.getCompanyGroupCode(), actualJsonNode.get("codigoGrupoEmpresa").asText());
        assertEquals(beneficiaryClientRequest.getTsLocalCode(), actualJsonNode.get("codigoLocalTS").asText());
        assertEquals(beneficiaryClientRequest.getWorkplaceCode(), actualJsonNode.get("codigoLocalTrabalho").asText());
        assertEquals(beneficiaryClientRequest.getAllocationCode(), actualJsonNode.get("codigoLotacao").asText());
        assertEquals(beneficiaryClientRequest.getTsAllocationCode(), actualJsonNode.get("codigoLotacaoTS").asText());
        assertEquals(beneficiaryClientRequest.getMunicipalityCode(), actualJsonNode.get("codigoMunicipio").asText());
        assertEquals(beneficiaryClientRequest.getServiceMunicipalityCode(), actualJsonNode.get("codigoMunicipioAtendimento").asText());
        assertEquals(beneficiaryClientRequest.getBirthMunicipalityCode(), actualJsonNode.get("codigoMunicipioNaturalidade").asText());
        assertEquals(beneficiaryClientRequest.getResidenceMunicipalityCode(), actualJsonNode.get("codigoMunicipioResidencia").asText());
        assertEquals(beneficiaryClientRequest.getOriginOperatorCode(), actualJsonNode.get("codigoOperadoraOrigem").asText());
        assertEquals(beneficiaryClientRequest.getIssuingBodyCode(), actualJsonNode.get("codigoOrgaoEmissor").asText());
        assertEquals(beneficiaryClientRequest.getCountryCode(), actualJsonNode.get("codigoPais").asText());
        assertEquals(beneficiaryClientRequest.getIssuingCountryCode(), actualJsonNode.get("codigoPaisEmissor").asText());
        assertEquals(beneficiaryClientRequest.getPlanCode(), actualJsonNode.get("codigoPlano").asText());
        assertEquals(beneficiaryClientRequest.getOriginPlanCode(), actualJsonNode.get("codigoPlanoOrigem").asText());
        assertEquals(beneficiaryClientRequest.getMovementSituationCode(), actualJsonNode.get("codigoSituacaoMovimentacao").asText());
        assertEquals(beneficiaryClientRequest.getTsCode(), actualJsonNode.get("codigoTS").asText());
        assertEquals(beneficiaryClientRequest.getTsContractCode(), actualJsonNode.get("codigoTSContrato").asText());
        assertEquals(beneficiaryClientRequest.getTsHolderCode(), actualJsonNode.get("codigoTSTitular").asText());
        assertEquals(beneficiaryClientRequest.getBillingTypeCode(), actualJsonNode.get("codigoTipoCobranca").asText());
        assertEquals(beneficiaryClientRequest.getLayoutTypeCode(), actualJsonNode.get("codigoTipoLayout").asText());
        assertEquals(beneficiaryClientRequest.getAddressTypeCode(), actualJsonNode.get("codigoTipoLogradouro").asText());
        assertEquals(beneficiaryClientRequest.getUnimedServiceLocalCode(), actualJsonNode.get("codigoUnimedLocalAtendimento").asText());
        assertEquals(beneficiaryClientRequest.getUnimedOriginCode(), actualJsonNode.get("codigoUnimedOrigem").asText());
        assertEquals(beneficiaryClientRequest.getUserCode(), actualJsonNode.get("codigoUsuario").asText());
        assertEquals(beneficiaryClientRequest.getAddressComplement(), actualJsonNode.get("complementoEndereco").asText());
        assertEquals(beneficiaryClientRequest.getAdmissionDate(), actualJsonNode.get("dataAdmissao").asText());
        assertEquals(beneficiaryClientRequest.getMarriageDate(), actualJsonNode.get("dataCasamento").asText());
        assertEquals(beneficiaryClientRequest.getIdentityIssuanceDate(), actualJsonNode.get("dataEmissaoIdentidade").asText());
        assertEquals(beneficiaryClientRequest.getInclusionDate(), actualJsonNode.get("dataInclusao").asText());
        assertEquals(beneficiaryClientRequest.getContributionStartDate(), actualJsonNode.get("dataInicioContribuicao").asText());
        assertEquals(beneficiaryClientRequest.getAllocationDate(), actualJsonNode.get("dataLotacao").asText());
        assertEquals(beneficiaryClientRequest.getMovementDate(), actualJsonNode.get("dataMovimento").asText());
        assertEquals(beneficiaryClientRequest.getBirthDate(), actualJsonNode.get("dataNascimento").asText());
        assertEquals(beneficiaryClientRequest.getLastPaymentDateOrigin(), actualJsonNode.get("dataUltimoPagamentoOrigem").asText());
        assertEquals(beneficiaryClientRequest.getCellphoneAreaCode(), actualJsonNode.get("dddCelular").asText());
        assertEquals(beneficiaryClientRequest.getDueDay(), actualJsonNode.get("diaVencimento").asText());
        assertEquals(beneficiaryClientRequest.isBillingAddress(), actualJsonNode.get("enderecoDeCobranca").asBoolean());
        assertEquals(beneficiaryClientRequest.isCorrespondenceAddress(), actualJsonNode.get("enderecoDeCorrespondencia").asBoolean());
        assertEquals(beneficiaryClientRequest.getEmailAddress(), actualJsonNode.get("enderecoEmail").asText());
        assertEquals(beneficiaryClientRequest.isResidentialAddress(), actualJsonNode.get("enderecoResidencial").asBoolean());
        assertEquals(beneficiaryClientRequest.getMaritalStatus(), actualJsonNode.get("estadoCivil").asText());
        assertEquals(beneficiaryClientRequest.isExcludeAddress(), actualJsonNode.get("excluirEndereco").asBoolean());
        assertEquals(beneficiaryClientRequest.isPortabilityExercisedOrigin(), actualJsonNode.get("exerceuPortabilidadeOrigem").asBoolean());
        assertEquals(beneficiaryClientRequest.getMovementGroupingForm(), actualJsonNode.get("formaAgrupamentoMovimentacoes").asText());
        assertEquals(beneficiaryClientRequest.getBatchClosureForm(), actualJsonNode.get("formaFechamentoLote").asText());
        assertEquals(beneficiaryClientRequest.getCriticismValidationForm(), actualJsonNode.get("formaValidacaoCriticas").asText());
        assertEquals(beneficiaryClientRequest.getNationality(), actualJsonNode.get("nacionalidade").asText());
        assertEquals(beneficiaryClientRequest.getAssociateName(), actualJsonNode.get("nomeAssociado").asText());
        assertEquals(beneficiaryClientRequest.getNeighborhoodName(), actualJsonNode.get("nomeBairro").asText());
        assertEquals(beneficiaryClientRequest.getCardName(), actualJsonNode.get("nomeCartao").asText());
        assertEquals(beneficiaryClientRequest.getCityName(), actualJsonNode.get("nomeCidade").asText());
        assertEquals(beneficiaryClientRequest.getAddressName(), actualJsonNode.get("nomeLogradouro").asText());
        assertEquals(beneficiaryClientRequest.getMotherName(), actualJsonNode.get("nomeMae").asText());
        assertEquals(beneficiaryClientRequest.getFatherName(), actualJsonNode.get("nomePai").asText());
        assertEquals(beneficiaryClientRequest.getOriginAssociateNumber(), actualJsonNode.get("numeroAssociadoNaOrigem").asText());
        assertEquals(beneficiaryClientRequest.getOperatorAssociateNumber(), actualJsonNode.get("numeroAssociadoOperadora").asText());
        assertEquals(beneficiaryClientRequest.getAssociateOrWalletHolderNumber(), actualJsonNode.get("numeroAssociadoOuCarteiraTitular").asText());
        assertEquals(beneficiaryClientRequest.getAssociateOrWalletNumber(), actualJsonNode.get("numeroAssociadoOuNumeroCarteira").asText());
        assertEquals(beneficiaryClientRequest.getZipCode(), actualJsonNode.get("numeroCEP").asText());
        assertEquals(beneficiaryClientRequest.getCpfNumber(), actualJsonNode.get("numeroCPF").asText());
        assertEquals(beneficiaryClientRequest.getCellphoneNumber(), actualJsonNode.get("numeroCelular").asText());
        assertEquals(beneficiaryClientRequest.getReimbursementAccountNumber(), actualJsonNode.get("numeroContaCorrenteReembolso").asText());
        assertEquals(beneficiaryClientRequest.getContractNumber(), actualJsonNode.get("numeroContrato").asText());
        assertEquals(beneficiaryClientRequest.getOriginContractNumber(), actualJsonNode.get("numeroContratoOrigem").asText());
        assertEquals(beneficiaryClientRequest.getPhoneAreaCode(), actualJsonNode.get("numeroDddTelefone").asText());
        assertEquals(beneficiaryClientRequest.getLiveBirthDeclarationNumber(), actualJsonNode.get("numeroDeclaracaoNascidoVivo").asText());
        assertEquals(beneficiaryClientRequest.getReimbursementAgencyDigit(), actualJsonNode.get("numeroDigitoAgenciaReembolso").asText());
        assertEquals(beneficiaryClientRequest.getReimbursementAccountDigit(), actualJsonNode.get("numeroDigitoContaReembolso").asText());
        assertEquals(beneficiaryClientRequest.getAddressNumber(), actualJsonNode.get("numeroEndereco").asText());
        assertEquals(beneficiaryClientRequest.getIdentityNumber(), actualJsonNode.get("numeroIdentidade").asText());
        assertEquals(beneficiaryClientRequest.getFounderRegistrationNumber(), actualJsonNode.get("numeroMatriculaInstituidor").asText());
        assertEquals(beneficiaryClientRequest.getCompanyRegistrationNumber(), actualJsonNode.get("numeroMatriculaNaEmpresa").asText());
        assertEquals(beneficiaryClientRequest.getNewCompanyRegistrationNumber(), actualJsonNode.get("numeroNovaMatriculaNaEmpresa").asText());
        assertEquals(beneficiaryClientRequest.getPisNumber(), actualJsonNode.get("numeroPIS").asText());
        assertEquals(beneficiaryClientRequest.getPortabilityOriginProductNumber(), actualJsonNode.get("numeroProdOpeOrigPortabilidade").asText());
        assertEquals(beneficiaryClientRequest.getOriginOperatorProductNumber(), actualJsonNode.get("numeroProdutoOperadoaraOrigem").asText());
        assertEquals(beneficiaryClientRequest.getExtensionNumber(), actualJsonNode.get("numeroRamal").asText());
        assertEquals(beneficiaryClientRequest.getBatchSequentialNumber(), actualJsonNode.get("numeroSequencialLote").asText());
        assertEquals(beneficiaryClientRequest.getRegistrationSequentialNumber(), actualJsonNode.get("numeroSequencialMatricula").asText());
        assertEquals(beneficiaryClientRequest.getPhoneNumber(), actualJsonNode.get("numeroTelefone").asText());
        assertEquals(beneficiaryClientRequest.getUniqueHealthNumber(), actualJsonNode.get("numeroUnicoSaude").asText());
        assertEquals(beneficiaryClientRequest.getObservations(), actualJsonNode.get("observacoes").asText());
        assertEquals(beneficiaryClientRequest.getWeight(), actualJsonNode.get("peso").asText());
        assertEquals(beneficiaryClientRequest.isHasPortability(), actualJsonNode.get("possuiPortabilidade").asBoolean());
        assertEquals(beneficiaryClientRequest.getMovementReference(), actualJsonNode.get("referenciaMovimentacao").asText());
        assertEquals(beneficiaryClientRequest.getMovementSequentialNumber(), actualJsonNode.get("sequencialMovimentacao").asText());
        assertEquals(beneficiaryClientRequest.getGender(), actualJsonNode.get("sexo").asText());
        assertEquals(beneficiaryClientRequest.getStateInitials(), actualJsonNode.get("siglaUF").asText());
        assertEquals(beneficiaryClientRequest.getCompanySituation(), actualJsonNode.get("situacaoNaEmpresa").asText());
        assertEquals(beneficiaryClientRequest.getAssociateType(), actualJsonNode.get("tipoAssociado").asText());
        assertEquals(beneficiaryClientRequest.getOperationType(), actualJsonNode.get("tipoOperacao").asText());
        assertEquals(beneficiaryClientRequest.isLivesAbroad(), actualJsonNode.get("viveNoExterior").asBoolean());

        // Asserts for the nested objects
        List<BeneficiaryClientRequest.PreExistingDisease> preExistingDiseases = beneficiaryClientRequest.getPreExistingDiseases();
        JsonNode preExistingDiseasesNode = actualJsonNode.get("doencasPreExistentes");
        assertEquals(preExistingDiseases.size(), preExistingDiseasesNode.size());

        for (int i = 0; i < preExistingDiseases.size(); i++) {
            BeneficiaryClientRequest.PreExistingDisease disease = preExistingDiseases.get(i);
            JsonNode diseaseNode = preExistingDiseasesNode.get(i);
            assertEquals(disease.getDiseaseInternationalCode(), diseaseNode.get("codigoInternacionalDoenca").asText());
            assertEquals(disease.getDiseaseName(), diseaseNode.get("nomeDoenca").asText());
            assertEquals(disease.getMovementSequentialNumber(), diseaseNode.get("numeroSequencialMovimentacao").asText());
        }
    }

    @Test
    @DisplayName("Test JSON conversion for DeleteBeneficiaryRequest")
    public void testJsonDeleteBeneficiaryRequest() throws IOException {
        // Arrange
        DeleteBeneficiaryRequest request = buildDeleteBeneficiaryRequest();

        // Act
        BeneficiaryClientRequest beneficiaryClientRequest = BeneficiaryMapper.convert(request);

        ObjectMapper objectMapper = new ObjectMapper();
        String file = new String(
                Files.readAllBytes(
                        Paths.get(URL_JSON_FOLDER + "delete-beneficiary-request.json")), StandardCharsets.UTF_8
        );

        JsonNode actualJsonNode = objectMapper.readTree(file);

        // Assert
        assertEquals(beneficiaryClientRequest.getCompanyCode(), actualJsonNode.get("codigoEmpresa").asText());
        assertEquals(beneficiaryClientRequest.getCompanyGroupCode(), actualJsonNode.get("codigoGrupoEmpresa").asText());
        assertEquals(beneficiaryClientRequest.getExclusionReasonCode(), actualJsonNode.get("codigoMotivoExclusao").asText());
        assertEquals(beneficiaryClientRequest.getMovementSituationCode(), actualJsonNode.get("codigoSituacaoMovimentacao").asText());
        assertEquals(beneficiaryClientRequest.getTsCode(), actualJsonNode.get("codigoTS").asText());
        assertEquals(beneficiaryClientRequest.getTsContractCode(), actualJsonNode.get("codigoTSContrato").asText());
        assertEquals(beneficiaryClientRequest.getLayoutTypeCode(), actualJsonNode.get("codigoTipoLayout").asText());
        assertEquals(beneficiaryClientRequest.getTsDentalCode(), actualJsonNode.get("codigoTsDental").asText());
        assertEquals(beneficiaryClientRequest.getUserCode(), actualJsonNode.get("codigoUsuario").asText());
        assertEquals(beneficiaryClientRequest.isContributor(), actualJsonNode.get("contrinutario").asBoolean());
        assertEquals(beneficiaryClientRequest.getExclusionDate(), actualJsonNode.get("dataExclusao").asText());
        assertEquals(beneficiaryClientRequest.getMovementDate(), actualJsonNode.get("dataMovimento").asText());
        assertEquals(beneficiaryClientRequest.isIssueCertificate(), actualJsonNode.get("emiteComprovante").asBoolean());
        assertEquals(beneficiaryClientRequest.getMovementGroupingForm(), actualJsonNode.get("formaAgrupamentoMovimentacoes").asText());
        assertEquals(beneficiaryClientRequest.getBatchClosureForm(), actualJsonNode.get("formaFechamentoLote").asText());
        assertEquals(beneficiaryClientRequest.getCriticismValidationForm(), actualJsonNode.get("formaValidacaoCriticas").asText());
        assertEquals(beneficiaryClientRequest.isDentalMovement(), actualJsonNode.get("movimentaDental").asBoolean());
        assertEquals(beneficiaryClientRequest.getAssociateName(), actualJsonNode.get("nomeAssociado").asText());
        assertEquals(beneficiaryClientRequest.getAssociateOrWalletNumber(), actualJsonNode.get("numeroAssociadoOuNumeroCarteira").asText());
        assertEquals(beneficiaryClientRequest.getContractNumber(), actualJsonNode.get("numeroContrato").asText());
        assertEquals(beneficiaryClientRequest.getBatchSequentialNumber(), actualJsonNode.get("numeroSequencialLote").asText());
        assertEquals(beneficiaryClientRequest.getMovementReference(), actualJsonNode.get("referenciaMovimentacao").asText());
        assertEquals(beneficiaryClientRequest.getMovementSequentialNumber(), actualJsonNode.get("sequencialMovimentacao").asText());
        assertEquals(beneficiaryClientRequest.getAssociateType(), actualJsonNode.get("tipoAssociado").asText());
        assertEquals(beneficiaryClientRequest.getOperationType(), actualJsonNode.get("tipoOperacao").asText());
        assertEquals(beneficiaryClientRequest.getFineValue(), actualJsonNode.get("valorMulta").asText());
    }

    @Test
    @DisplayName("Test JSON conversion for PlanChangeRequest")
    public void testJsonPlanChangeRequest() throws IOException {
        // Arrange
        PlanChangeRequest request = buildPlanChangeRequest();

        // Act
        BeneficiaryClientRequest beneficiaryClientRequest = BeneficiaryMapper.convert(request);

        ObjectMapper objectMapper = new ObjectMapper();
        String file = new String(
                Files.readAllBytes(
                        Paths.get(URL_JSON_FOLDER + "plan-change-request.json")), StandardCharsets.UTF_8
        );

        JsonNode actualJsonNode = objectMapper.readTree(file);

        // Assert
        assertEquals(beneficiaryClientRequest.getContractNumber(), actualJsonNode.get("numeroContrato").asText());
        assertEquals(beneficiaryClientRequest.getMovementReference(), actualJsonNode.get("referenciaMovimentacao").asText());
        assertEquals(beneficiaryClientRequest.getMovementDate(), actualJsonNode.get("dataMovimento").asText());
        assertEquals(beneficiaryClientRequest.getUserCode(), actualJsonNode.get("codigoUsuario").asText());
        assertEquals(beneficiaryClientRequest.getOperationType(), actualJsonNode.get("tipoOperacao").asText());
        assertEquals(beneficiaryClientRequest.getAssociateOrHolderWalletNumber(), actualJsonNode.get("numeroAssociadoOuNumeroCarteiraTitular").asText());
        assertEquals(beneficiaryClientRequest.getOldPlanCode(), actualJsonNode.get("codigoPlanoAntigo").asText());
        assertEquals(beneficiaryClientRequest.getNewPlanCode(), actualJsonNode.get("codigoPlanoNovo").asText());
        assertEquals(beneficiaryClientRequest.getSubmissionDeadlineDate(), actualJsonNode.get("dataLimiteEnvio").asText());
        assertEquals(beneficiaryClientRequest.getMigrationDate(), actualJsonNode.get("dataMigracao").asText());
        assertEquals(beneficiaryClientRequest.getScope(), actualJsonNode.get("abrangencia").asText());
        assertEquals(beneficiaryClientRequest.getBatchClosureForm(), actualJsonNode.get("formaFechamentoLote").asText());
        assertEquals(beneficiaryClientRequest.getMovementGroupingForm(), actualJsonNode.get("formaAgrupamentoMovimentacoes").asText());
        assertEquals(beneficiaryClientRequest.getCriticismValidationForm(), actualJsonNode.get("formaValidacaoCriticas").asText());
    }

    @Test
    @DisplayName("Test conversion of CreateDependentRequest to BeneficiaryClientRequest")
    public void testConvertCreateDependentRequest() {
        // Arrange
        CreateDependentRequest request = buildCreateDependentRequest();

        // Act
        BeneficiaryClientRequest beneficiaryClientRequest = BeneficiaryMapper.convert(request);

        // Assert
        assertEquals(request.getAgencyCode(), beneficiaryClientRequest.getAgencyCode());
        assertEquals(request.getNeighborhoodCode(), beneficiaryClientRequest.getNeighborhoodCode());
        assertEquals(request.getBankCode(), beneficiaryClientRequest.getBankCode());
        assertEquals(request.getOccupationCode(), beneficiaryClientRequest.getOccupationCode());
        assertEquals(request.getDependencyCode(), beneficiaryClientRequest.getDependencyCode());
        assertEquals(request.getCompanyCode(), beneficiaryClientRequest.getCompanyCode());
        assertEquals(request.getTsLocalCode(), beneficiaryClientRequest.getTsLocalCode());
        assertEquals(request.getAllocationCode(), beneficiaryClientRequest.getAllocationCode());
        assertEquals(request.getTsAllocationCode(), beneficiaryClientRequest.getTsAllocationCode());
        assertEquals(request.getMunicipalityCode(), beneficiaryClientRequest.getMunicipalityCode());
        assertEquals(request.getServiceMunicipalityCode(), beneficiaryClientRequest.getServiceMunicipalityCode());
        assertEquals(request.getBirthMunicipalityCode(), beneficiaryClientRequest.getBirthMunicipalityCode());
        assertEquals(request.getResidenceMunicipalityCode(), beneficiaryClientRequest.getResidenceMunicipalityCode());
        assertEquals(request.getIssuingBodyCode(), beneficiaryClientRequest.getIssuingBodyCode());
        assertEquals(request.getCountryCode(), beneficiaryClientRequest.getCountryCode());
        assertEquals(request.getIssuingCountryCode(), beneficiaryClientRequest.getIssuingCountryCode());
        assertEquals(request.getPlanCode(), beneficiaryClientRequest.getPlanCode());
        assertEquals(request.getOriginPlanCode(), beneficiaryClientRequest.getOriginPlanCode());
        assertEquals(request.getBillingTypeCode(), beneficiaryClientRequest.getBillingTypeCode());
        assertEquals(request.getAddressTypeCode(), beneficiaryClientRequest.getAddressTypeCode());
        assertEquals(request.getOperationTypeCode(), beneficiaryClientRequest.getOperationTypeCode());
        assertEquals(request.getTsHolderCode(), beneficiaryClientRequest.getTsHolderCode());
        assertEquals(request.getAddressComplement(), beneficiaryClientRequest.getAddressComplement());
        assertEquals(request.getMarriageDate(), beneficiaryClientRequest.getMarriageDate());
        assertEquals(request.getIdentityIssuanceDate(), beneficiaryClientRequest.getIdentityIssuanceDate());
        assertEquals(request.getInclusionDate(), beneficiaryClientRequest.getInclusionDate());
        assertEquals(request.getContributionStartDate(), beneficiaryClientRequest.getContributionStartDate());
        assertEquals(request.getAllocationDate(), beneficiaryClientRequest.getAllocationDate());
        assertEquals(request.getBirthDate(), beneficiaryClientRequest.getBirthDate());
        assertEquals(request.getCellphoneAreaCode(), beneficiaryClientRequest.getCellphoneAreaCode());
        assertEquals(request.getDueDay(), beneficiaryClientRequest.getDueDay());
        assertTrue(beneficiaryClientRequest.isAdministrator());
        assertTrue(beneficiaryClientRequest.isBillingAddress());
        assertTrue(beneficiaryClientRequest.isCorrespondenceAddress());
        assertEquals(request.getEmailAddress(), beneficiaryClientRequest.getEmailAddress());
        assertTrue(beneficiaryClientRequest.isResidentialAddress());
        assertEquals(request.getMaritalStatus(), beneficiaryClientRequest.getMaritalStatus());
        assertTrue(beneficiaryClientRequest.isExcludeAddress());
        assertTrue(beneficiaryClientRequest.isRequiresHealthDeclaration());
        assertEquals(request.getReferenceMonthYear(), beneficiaryClientRequest.getReferenceMonthYear());
        assertEquals(request.getNationality(), beneficiaryClientRequest.getNationality());
        assertEquals(request.getAssociateName(), beneficiaryClientRequest.getAssociateName());
        assertEquals(request.getNeighborhoodName(), beneficiaryClientRequest.getNeighborhoodName());
        assertEquals(request.getCardName(), beneficiaryClientRequest.getCardName());
        assertEquals(request.getCityName(), beneficiaryClientRequest.getCityName());
        assertEquals(request.getAddressName(), beneficiaryClientRequest.getAddressName());
        assertEquals(request.getMotherName(), beneficiaryClientRequest.getMotherName());
        assertEquals(request.getFatherName(), beneficiaryClientRequest.getFatherName());
        assertEquals(request.getAssociateNumber(), beneficiaryClientRequest.getAssociateNumber());
        assertEquals(request.getOriginAssociateNumber(), beneficiaryClientRequest.getOriginAssociateNumber());
        assertEquals(request.getOperatorAssociateNumber(), beneficiaryClientRequest.getOperatorAssociateNumber());
        assertEquals(request.getAssociateOrWalletHolderNumber(), beneficiaryClientRequest.getAssociateOrWalletHolderNumber());
        assertEquals(request.getHolderAssociateNumber(), beneficiaryClientRequest.getHolderAssociateNumber());
        assertEquals(request.getCellphoneNumber(), beneficiaryClientRequest.getCellphoneNumber());
        assertEquals(request.getZipCode(), beneficiaryClientRequest.getZipCode());
        assertEquals(request.getReimbursementAccountNumber(), beneficiaryClientRequest.getReimbursementAccountNumber());
        assertEquals(request.getContractNumber(), beneficiaryClientRequest.getContractNumber());
        assertEquals(request.getCpfNumber(), beneficiaryClientRequest.getCpfNumber());
        assertEquals(request.getPhoneAreaCode(), beneficiaryClientRequest.getPhoneAreaCode());
        assertEquals(request.getLiveBirthDeclarationNumber(), beneficiaryClientRequest.getLiveBirthDeclarationNumber());
        assertEquals(request.getReimbursementAgencyDigit(), beneficiaryClientRequest.getReimbursementAgencyDigit());
        assertEquals(request.getReimbursementAccountDigit(), beneficiaryClientRequest.getReimbursementAccountDigit());
        assertEquals(request.getAddressNumber(), beneficiaryClientRequest.getAddressNumber());
        assertEquals(request.getIdentityNumber(), beneficiaryClientRequest.getIdentityNumber());
        assertEquals(request.getFounderRegistrationNumber(), beneficiaryClientRequest.getFounderRegistrationNumber());
        assertEquals(request.getCompanyRegistrationNumber(), beneficiaryClientRequest.getCompanyRegistrationNumber());
        assertEquals(request.getNewCompanyRegistrationNumber(), beneficiaryClientRequest.getNewCompanyRegistrationNumber());
        assertEquals(request.getPisNumber(), beneficiaryClientRequest.getPisNumber());
        assertEquals(request.getPortabilityOriginProductNumber(), beneficiaryClientRequest.getPortabilityOriginProductNumber());
        assertEquals(request.getOriginOperatorProductNumber(), beneficiaryClientRequest.getOriginOperatorProductNumber());
        assertEquals(request.getExtensionNumber(), beneficiaryClientRequest.getExtensionNumber());
        assertEquals(request.getRegistrationSequentialNumber(), beneficiaryClientRequest.getRegistrationSequentialNumber());
        assertEquals(request.getPhoneNumber(), beneficiaryClientRequest.getPhoneNumber());
        assertEquals(request.getUniqueHealthNumber(), beneficiaryClientRequest.getUniqueHealthNumber());
        assertEquals(request.getGender(), beneficiaryClientRequest.getGender());
        assertEquals(request.getStateInitials(), beneficiaryClientRequest.getStateInitials());
        assertEquals(request.getCompanySituation(), beneficiaryClientRequest.getCompanySituation());
        assertFalse(beneficiaryClientRequest.isLivesAbroad());
    }

    @Test
    @DisplayName("Test conversion of DeleteBeneficiaryRequest to BeneficiaryClientRequest")
    public void testConvertDeleteBeneficiaryRequest() {
        // Arrange
        DeleteBeneficiaryRequest request = buildDeleteBeneficiaryRequest();

        // Act
        BeneficiaryClientRequest beneficiaryClientRequest = BeneficiaryMapper.convert(request);

        // Assert
        assertEquals(request.getCompanyCode(), beneficiaryClientRequest.getCompanyCode());
        assertEquals(request.getCompanyGroupCode(), beneficiaryClientRequest.getCompanyGroupCode());
        assertEquals(request.getExclusionReasonCode(), beneficiaryClientRequest.getExclusionReasonCode());
        assertEquals(request.getMovementSituationCode(), beneficiaryClientRequest.getMovementSituationCode());
        assertEquals(request.getLayoutTypeCode(), beneficiaryClientRequest.getLayoutTypeCode());
        assertEquals(request.getTsCode(), beneficiaryClientRequest.getTsCode());
        assertEquals(request.getTsContractCode(), beneficiaryClientRequest.getTsContractCode());
        assertEquals(request.getTsDentalCode(), beneficiaryClientRequest.getTsDentalCode());
        assertEquals(request.getUserCode(), beneficiaryClientRequest.getUserCode());
        assertTrue(beneficiaryClientRequest.isContributor());
        assertEquals(request.getExclusionDate(), beneficiaryClientRequest.getExclusionDate());
        assertEquals(request.getMovementDate(), beneficiaryClientRequest.getMovementDate());
        assertTrue(beneficiaryClientRequest.isIssueCertificate());
        assertEquals(request.getMovementGroupingForm(), beneficiaryClientRequest.getMovementGroupingForm());
        assertEquals(request.getBatchClosureForm(), beneficiaryClientRequest.getBatchClosureForm());
        assertEquals(request.getCriticismValidationForm(), beneficiaryClientRequest.getCriticismValidationForm());
        assertTrue(beneficiaryClientRequest.isDentalMovement());
        assertEquals(request.getAssociateName(), beneficiaryClientRequest.getAssociateName());
        assertEquals(request.getAssociateOrWalletNumber(), beneficiaryClientRequest.getAssociateOrWalletNumber());
        assertEquals(request.getContractNumber(), beneficiaryClientRequest.getContractNumber());
        assertEquals(request.getBatchSequentialNumber(), beneficiaryClientRequest.getBatchSequentialNumber());
        assertEquals(request.getMovementReference(), beneficiaryClientRequest.getMovementReference());
        assertEquals(request.getMovementSequentialNumber(), beneficiaryClientRequest.getMovementSequentialNumber());
        assertEquals(request.getAssociateType(), beneficiaryClientRequest.getAssociateType());
        assertEquals(request.getOperationType(), beneficiaryClientRequest.getOperationType());
        assertEquals(request.getFineValue(), beneficiaryClientRequest.getFineValue());
    }

    @Test
    @DisplayName("Test conversion of DeleteBeneficiaryRequest to BeneficiaryClientRequest")
    public void testConvertPlanChangeRequest() {
        // Arrange
        PlanChangeRequest request = buildPlanChangeRequest();

        // Act
        BeneficiaryClientRequest beneficiaryClientRequest = BeneficiaryMapper.convert(request);

        // Assert
        assertEquals(request.getScope(), beneficiaryClientRequest.getScope());
        assertEquals(request.getOldPlanCode(), beneficiaryClientRequest.getOldPlanCode());
        assertEquals(request.getNewPlanCode(), beneficiaryClientRequest.getNewPlanCode());
        assertEquals(request.getUserCode(), beneficiaryClientRequest.getUserCode());
        assertEquals(request.getSubmissionDeadlineDate(), beneficiaryClientRequest.getSubmissionDeadlineDate());
        assertEquals(request.getMigrationDate(), beneficiaryClientRequest.getMigrationDate());
        assertEquals(request.getMovementDate(), beneficiaryClientRequest.getMovementDate());
        assertEquals(request.getMovementGroupingForm(), beneficiaryClientRequest.getMovementGroupingForm());
        assertEquals(request.getBatchClosureForm(), beneficiaryClientRequest.getBatchClosureForm());
        assertEquals(request.getCriticismValidationForm(), beneficiaryClientRequest.getCriticismValidationForm());
        assertEquals(request.getAssociateOrHolderWalletNumber(), beneficiaryClientRequest.getAssociateOrHolderWalletNumber());
        assertEquals(request.getContractNumber(), beneficiaryClientRequest.getContractNumber());
        assertEquals(request.getMovementReference(), beneficiaryClientRequest.getMovementReference());
        assertEquals(request.getOperationType(), beneficiaryClientRequest.getOperationType());
    }

    @Test
    @DisplayName("Test conversion of UpdateBeneficiaryRequest to BeneficiaryClientRequest")
    public void testConvertUpdateBeneficiaryRequest() {
        // Arrange
        UpdateBeneficiaryRequest request = buildUpdateBeneficiaryRequest();

        // Act
        BeneficiaryClientRequest beneficiaryClientRequest = BeneficiaryMapper.convert(request);

        // Assert
        assertEquals(request.getHeight(), beneficiaryClientRequest.getHeight());
        assertTrue(beneficiaryClientRequest.isTemporaryPartialGraceOrigin());
        assertEquals(request.getAgencyCode(), beneficiaryClientRequest.getAgencyCode());
        assertEquals(request.getNeighborhoodCode(), beneficiaryClientRequest.getNeighborhoodCode());
        assertEquals(request.getBankCode(), beneficiaryClientRequest.getBankCode());
        assertEquals(request.getOccupationCode(), beneficiaryClientRequest.getOccupationCode());
        assertEquals(request.getJobPositionCode(), beneficiaryClientRequest.getJobPositionCode());
        assertEquals(request.getDependencyCode(), beneficiaryClientRequest.getDependencyCode());
        assertEquals(request.getCompanyCode(), beneficiaryClientRequest.getCompanyCode());
        assertEquals(request.getCompanyGroupCode(), beneficiaryClientRequest.getCompanyGroupCode());
        assertEquals(request.getWorkplaceCode(), beneficiaryClientRequest.getWorkplaceCode());
        assertEquals(request.getTsLocalCode(), beneficiaryClientRequest.getTsLocalCode());
        assertEquals(request.getAllocationCode(), beneficiaryClientRequest.getAllocationCode());
        assertEquals(request.getTsAllocationCode(), beneficiaryClientRequest.getTsAllocationCode());
        assertEquals(request.getMunicipalityCode(), beneficiaryClientRequest.getMunicipalityCode());
        assertEquals(request.getServiceMunicipalityCode(), beneficiaryClientRequest.getServiceMunicipalityCode());
        assertEquals(request.getBirthMunicipalityCode(), beneficiaryClientRequest.getBirthMunicipalityCode());
        assertEquals(request.getResidenceMunicipalityCode(), beneficiaryClientRequest.getResidenceMunicipalityCode());
        assertEquals(request.getOriginOperatorCode(), beneficiaryClientRequest.getOriginOperatorCode());
        assertEquals(request.getIssuingBodyCode(), beneficiaryClientRequest.getIssuingBodyCode());
        assertEquals(request.getCountryCode(), beneficiaryClientRequest.getCountryCode());
        assertEquals(request.getIssuingCountryCode(), beneficiaryClientRequest.getIssuingCountryCode());
        assertEquals(request.getPlanCode(), beneficiaryClientRequest.getPlanCode());
        assertEquals(request.getOriginPlanCode(), beneficiaryClientRequest.getOriginPlanCode());
        assertEquals(request.getMovementSituationCode(), beneficiaryClientRequest.getMovementSituationCode());
        assertEquals(request.getBillingTypeCode(), beneficiaryClientRequest.getBillingTypeCode());
        assertEquals(request.getLayoutTypeCode(), beneficiaryClientRequest.getLayoutTypeCode());
        assertEquals(request.getAddressTypeCode(), beneficiaryClientRequest.getAddressTypeCode());
        assertEquals(request.getTsCode(), beneficiaryClientRequest.getTsCode());
        assertEquals(request.getTsContractCode(), beneficiaryClientRequest.getTsContractCode());
        assertEquals(request.getTsHolderCode(), beneficiaryClientRequest.getTsHolderCode());
        assertEquals(request.getUnimedServiceLocalCode(), beneficiaryClientRequest.getUnimedServiceLocalCode());
        assertEquals(request.getUnimedOriginCode(), beneficiaryClientRequest.getUnimedOriginCode());
        assertEquals(request.getUserCode(), beneficiaryClientRequest.getUserCode());
        assertEquals(request.getAddressComplement(), beneficiaryClientRequest.getAddressComplement());
        assertEquals(request.getAdmissionDate(), beneficiaryClientRequest.getAdmissionDate());
        assertEquals(request.getMarriageDate(), beneficiaryClientRequest.getMarriageDate());
        assertEquals(request.getIdentityIssuanceDate(), beneficiaryClientRequest.getIdentityIssuanceDate());
        assertEquals(request.getInclusionDate(), beneficiaryClientRequest.getInclusionDate());
        assertEquals(request.getContributionStartDate(), beneficiaryClientRequest.getContributionStartDate());
        assertEquals(request.getAllocationDate(), beneficiaryClientRequest.getAllocationDate());
        assertEquals(request.getMovementDate(), beneficiaryClientRequest.getMovementDate());
        assertEquals(request.getBirthDate(), beneficiaryClientRequest.getBirthDate());
        assertEquals(request.getLastPaymentDateOrigin(), beneficiaryClientRequest.getLastPaymentDateOrigin());
        assertEquals(request.getCellphoneAreaCode(), beneficiaryClientRequest.getCellphoneAreaCode());
        assertEquals(request.getDueDay(), beneficiaryClientRequest.getDueDay());
        assertTrue(beneficiaryClientRequest.isBillingAddress());
        assertTrue(beneficiaryClientRequest.isCorrespondenceAddress());
        assertEquals(request.getEmailAddress(), beneficiaryClientRequest.getEmailAddress());
        assertTrue(beneficiaryClientRequest.isResidentialAddress());
        assertEquals(request.getMaritalStatus(), beneficiaryClientRequest.getMaritalStatus());
        assertTrue(beneficiaryClientRequest.isExcludeAddress());
        assertTrue(beneficiaryClientRequest.isPortabilityExercisedOrigin());
        assertEquals(request.getMovementGroupingForm(), beneficiaryClientRequest.getMovementGroupingForm());
        assertEquals(request.getBatchClosureForm(), beneficiaryClientRequest.getBatchClosureForm());
        assertEquals(request.getCriticismValidationForm(), beneficiaryClientRequest.getCriticismValidationForm());
        assertEquals(request.getNationality(), beneficiaryClientRequest.getNationality());
        assertEquals(request.getAssociateName(), beneficiaryClientRequest.getAssociateName());
        assertEquals(request.getNeighborhoodName(), beneficiaryClientRequest.getNeighborhoodName());
        assertEquals(request.getCardName(), beneficiaryClientRequest.getCardName());
        assertEquals(request.getCityName(), beneficiaryClientRequest.getCityName());
        assertEquals(request.getAddressName(), beneficiaryClientRequest.getAddressName());
        assertEquals(request.getMotherName(), beneficiaryClientRequest.getMotherName());
        assertEquals(request.getFatherName(), beneficiaryClientRequest.getFatherName());
        assertEquals(request.getOriginAssociateNumber(), beneficiaryClientRequest.getOriginAssociateNumber());
        assertEquals(request.getOperatorAssociateNumber(), beneficiaryClientRequest.getOperatorAssociateNumber());
        assertEquals(request.getAssociateOrWalletHolderNumber(), beneficiaryClientRequest.getAssociateOrWalletHolderNumber());
        assertEquals(request.getAssociateOrWalletNumber(), beneficiaryClientRequest.getAssociateOrWalletNumber());
        assertEquals(request.getCellphoneNumber(), beneficiaryClientRequest.getCellphoneNumber());
        assertEquals(request.getZipCode(), beneficiaryClientRequest.getZipCode());
        assertEquals(request.getReimbursementAccountNumber(), beneficiaryClientRequest.getReimbursementAccountNumber());
        assertEquals(request.getContractNumber(), beneficiaryClientRequest.getContractNumber());
        assertEquals(request.getOriginContractNumber(), beneficiaryClientRequest.getOriginContractNumber());
        assertEquals(request.getCpfNumber(), beneficiaryClientRequest.getCpfNumber());
        assertEquals(request.getPhoneAreaCode(), beneficiaryClientRequest.getPhoneAreaCode());
        assertEquals(request.getLiveBirthDeclarationNumber(), beneficiaryClientRequest.getLiveBirthDeclarationNumber());
        assertEquals(request.getReimbursementAgencyDigit(), beneficiaryClientRequest.getReimbursementAgencyDigit());
        assertEquals(request.getReimbursementAccountDigit(), beneficiaryClientRequest.getReimbursementAccountDigit());
        assertEquals(request.getAddressNumber(), beneficiaryClientRequest.getAddressNumber());
        assertEquals(request.getIdentityNumber(), beneficiaryClientRequest.getIdentityNumber());
        assertEquals(request.getFounderRegistrationNumber(), beneficiaryClientRequest.getFounderRegistrationNumber());
        assertEquals(request.getCompanyRegistrationNumber(), beneficiaryClientRequest.getCompanyRegistrationNumber());
        assertEquals(request.getNewCompanyRegistrationNumber(), beneficiaryClientRequest.getNewCompanyRegistrationNumber());
        assertEquals(request.getPisNumber(), beneficiaryClientRequest.getPisNumber());
        assertEquals(request.getPortabilityOriginProductNumber(), beneficiaryClientRequest.getPortabilityOriginProductNumber());
        assertEquals(request.getOriginOperatorProductNumber(), beneficiaryClientRequest.getOriginOperatorProductNumber());
        assertEquals(request.getExtensionNumber(), beneficiaryClientRequest.getExtensionNumber());
        assertEquals(request.getBatchSequentialNumber(), beneficiaryClientRequest.getBatchSequentialNumber());
        assertEquals(request.getRegistrationSequentialNumber(), beneficiaryClientRequest.getRegistrationSequentialNumber());
        assertEquals(request.getPhoneNumber(), beneficiaryClientRequest.getPhoneNumber());
        assertEquals(request.getUniqueHealthNumber(), beneficiaryClientRequest.getUniqueHealthNumber());
        assertEquals(request.getObservations(), beneficiaryClientRequest.getObservations());
        assertEquals(request.getWeight(), beneficiaryClientRequest.getWeight());
        assertTrue(beneficiaryClientRequest.isHasPortability());
        assertEquals(request.getMovementReference(), beneficiaryClientRequest.getMovementReference());
        assertEquals(request.getMovementSequentialNumber(), beneficiaryClientRequest.getMovementSequentialNumber());
        assertEquals(request.getGender(), beneficiaryClientRequest.getGender());
        assertEquals(request.getStateInitials(), beneficiaryClientRequest.getStateInitials());
        assertEquals(request.getCompanySituation(), beneficiaryClientRequest.getCompanySituation());
        assertEquals(request.getAssociateType(), beneficiaryClientRequest.getAssociateType());
        assertEquals(request.getOperationType(), beneficiaryClientRequest.getOperationType());
        assertTrue(beneficiaryClientRequest.isLivesAbroad());

        List<BeneficiaryClientRequest.PreExistingDisease> expectedPreExistingDiseases = request.getPreExistingDiseases().stream()
                .map(disease -> BeneficiaryClientRequest.PreExistingDisease.builder()
                        .diseaseInternationalCode(disease.getDiseaseInternationalCode())
                        .diseaseName(disease.getDiseaseName())
                        .movementSequentialNumber(disease.getMovementSequentialNumber())
                        .build())
                .collect(Collectors.toList());
        assertEquals(expectedPreExistingDiseases, beneficiaryClientRequest.getPreExistingDiseases());
    }

    @Test
    @DisplayName("Test conversion with null fields")
    public void testConvertWithNullFields() {
        // Arrange
        UpdateBeneficiaryRequest request = UpdateBeneficiaryRequest.builder()
                .height(null)
                .agencyCode(null)
                .build();

        // Act
        BeneficiaryClientRequest beneficiaryClientRequest = BeneficiaryMapper.convert(request);

        // Assert
        assertNull(beneficiaryClientRequest.getHeight());
        assertNull(beneficiaryClientRequest.getAgencyCode());
    }

    @Test
    @DisplayName("Test conversion with empty and null lists")
    public void testConvertWithEmptyAndNullLists() {
        // Arrange
        UpdateBeneficiaryRequest requestWithEmptyList = buildUpdateBeneficiaryRequest();
        requestWithEmptyList.setPreExistingDiseases(Collections.emptyList());

        UpdateBeneficiaryRequest requestWithNullList = buildUpdateBeneficiaryRequest();
        requestWithNullList.setPreExistingDiseases(null);

        // Act
        BeneficiaryClientRequest beneficiaryClientRequestWithEmptyList = BeneficiaryMapper.convert(requestWithEmptyList);
        BeneficiaryClientRequest beneficiaryClientRequestWithNullList = BeneficiaryMapper.convert(requestWithNullList);

        // Assert
        assertTrue(beneficiaryClientRequestWithEmptyList.getPreExistingDiseases().isEmpty());
        assertNull(beneficiaryClientRequestWithNullList.getPreExistingDiseases());
    }

    @Test
    @DisplayName("Test conversion of boolean fields")
    public void testConvertBooleanFields() {
        // Arrange
        UpdateBeneficiaryRequest request = buildUpdateBeneficiaryRequest();

        // Act
        BeneficiaryClientRequest beneficiaryClientRequest = BeneficiaryMapper.convert(request);

        // Assert
        assertTrue(beneficiaryClientRequest.isTemporaryPartialGraceOrigin());
        assertTrue(beneficiaryClientRequest.isBillingAddress());
        assertTrue(beneficiaryClientRequest.isCorrespondenceAddress());
        assertTrue(beneficiaryClientRequest.isResidentialAddress());
        assertTrue(beneficiaryClientRequest.isExcludeAddress());
        assertTrue(beneficiaryClientRequest.isPortabilityExercisedOrigin());
        assertTrue(beneficiaryClientRequest.isLivesAbroad());
    }

    @Test
    @DisplayName("Test conversion performance")
    public void testConvertPerformance() {
        // Arrange
        UpdateBeneficiaryRequest request = buildUpdateBeneficiaryRequest();

        long startTime = System.nanoTime();

        // Act
        for (int i = 0; i < 1000; i++) {
            BeneficiaryMapper.convert(request);
        }

        long endTime = System.nanoTime();

        long duration = (endTime - startTime) / 1000000;
        System.out.println("Conversion took " + duration + " ms");

        // Assert
        assertTrue(duration < 1000);
    }

    private UpdateBeneficiaryRequest buildUpdateBeneficiaryRequest() {
        return UpdateBeneficiaryRequest.builder()
                .height("0")
                .temporaryPartialGraceOrigin(true)
                .agencyCode("0")
                .neighborhoodCode("21702")
                .bankCode("0")
                .occupationCode("") // codigoBrasileiroDeOcupacao
                .jobPositionCode("0")
                .dependencyCode("0")
                .companyCode("4423540")
                .companyGroupCode("0")
                .workplaceCode("") // codigoLocalTrabalho
                .tsLocalCode("0")
                .allocationCode("") // codigoLotacao
                .tsAllocationCode("0")
                .municipalityCode("0")
                .serviceMunicipalityCode("9369")
                .birthMunicipalityCode("9369")
                .residenceMunicipalityCode("9369")
                .originOperatorCode("") // codigoOperadoraOrigem
                .issuingBodyCode("") // codigoOrgaoEmissor
                .countryCode("32")
                .issuingCountryCode("0")
                .planCode("PMEEFAP")
                .originPlanCode("") // codigoPlanoOrigem
                .movementSituationCode("0")
                .billingTypeCode("0")
                .layoutTypeCode("0")
                .addressTypeCode("Rua")
                .tsCode("0")
                .tsContractCode("") // codigoTSContrato
                .tsHolderCode("0")
                .unimedServiceLocalCode("0")
                .unimedOriginCode("0")
                .userCode("SERVICO")
                .addressComplement("")
                .admissionDate("2024-01-09")
                .marriageDate("2024-01-09")
                .identityIssuanceDate("2024-01-09")
                .inclusionDate("2024-01-09")
                .contributionStartDate("2024-01-09")
                .allocationDate("2024-01-09")
                .movementDate("2024-01-09")
                .birthDate("2024-01-09")
                .lastPaymentDateOrigin("2024-01-09")
                .cellphoneAreaCode("11")
                .dueDay("1")
                .billingAddress(true)
                .correspondenceAddress(true)
                .emailAddress("edu8asdf5a4@gmail.com")
                .residentialAddress(true)
                .maritalStatus("2")
                .excludeAddress(true)
                .portabilityExercisedOrigin(true)
                .movementGroupingForm("1")
                .batchClosureForm("1")
                .criticismValidationForm("1")
                .nationality("B")
                .associateName("CLAUDIO TARABORRELLI")
                .neighborhoodName("Jardins")
                .cardName("CLAUDIO TARABORRELLI")
                .cityName("") // nomeCidade
                .addressName("PAULO BARREIROS")
                .motherName("Maria TARABORRELLI")
                .fatherName("Marcos TARABORRELLI")
                .originAssociateNumber("") // numeroAssociadoNaOrigem
                .operatorAssociateNumber("") // numeroAssociadoOperadora
                .associateOrWalletHolderNumber("") // numeroAssociadoOuCarteiraTitular
                .associateOrWalletNumber("9941638278030005")
                .zipCode("18612030")
                .cpfNumber("08864682805")
                .cellphoneNumber("11995848219")
                .reimbursementAccountNumber("") // numeroContaCorrenteReembolso
                .contractNumber("24994028820")
                .originContractNumber("") // numeroContratoOrigem
                .phoneAreaCode("") // numeroDddTelefone
                .liveBirthDeclarationNumber("") // numeroDeclaracaoNascidoVivo
                .reimbursementAgencyDigit("") // numeroDigitoAgenciaReembolso
                .reimbursementAccountDigit("") // numeroDigitoContaReembolso
                .addressNumber("500")
                .identityNumber("") // numeroIdentidade
                .founderRegistrationNumber("") // numeroMatriculaInstituidor
                .companyRegistrationNumber("1")
                .newCompanyRegistrationNumber("") // numeroNovaMatriculaNaEmpresa
                .pisNumber("") // numeroPIS
                .portabilityOriginProductNumber("") // numeroProdOpeOrigPortabilidade
                .originOperatorProductNumber("") // numeroProdutoOperadoaraOrigem
                .extensionNumber("") // numeroRamal
                .batchSequentialNumber("0")
                .registrationSequentialNumber("") // numeroSequencialMatricula
                .phoneNumber("") // numeroTelefone
                .uniqueHealthNumber("898002981271247")
                .observations("")
                .weight("0")
                .hasPortability(true)
                .movementReference("2024-01-09")
                .movementSequentialNumber("0")
                .gender("M")
                .stateInitials("SP")
                .companySituation("2")
                .associateType("T")
                .operationType("3")
                .livesAbroad(true)
                .preExistingDiseases(Collections.singletonList(
                        new UpdateBeneficiaryRequest.PreExistingDisease("", "", "0")
                ))
                .build();
    }

    private PlanChangeRequest buildPlanChangeRequest() {
        return PlanChangeRequest.builder()
                .contractNumber("59942288")
                .movementReference("2024-01-11")
                .movementDate("2024-01-11")
                .userCode("SERVICO")
                .operationType("5")
                .associateOrHolderWalletNumber("9941645535545001")
                .oldPlanCode("SSS")
                .newPlanCode("SSD")
                .submissionDeadlineDate("2024-01-11")
                .migrationDate("2024-01-11")
                .scope("T")
                .batchClosureForm("1")
                .movementGroupingForm("1")
                .criticismValidationForm("1")
                .build();
    }

    private DeleteBeneficiaryRequest buildDeleteBeneficiaryRequest() {
        return DeleteBeneficiaryRequest.builder()
                .companyCode("0")
                .companyGroupCode("0")
                .exclusionReasonCode("5")
                .movementSituationCode("0")
                .layoutTypeCode("4")
                .tsCode("0")
                .tsContractCode("")
                .tsDentalCode("0")
                .userCode("SERVICO")
                .contributor(true)
                .exclusionDate("2024-01-11")
                .movementDate("2024-01-12")
                .issueCertificate(true)
                .movementGroupingForm("1")
                .batchClosureForm("1")
                .criticismValidationForm("1")
                .dentalMovement(true)
                .associateName("ADAO PAES")
                .associateOrWalletNumber("9940053512555008")
                .contractNumber("59941292")
                .batchSequentialNumber("0")
                .movementReference("2024-01-01")
                .movementSequentialNumber("0")
                .associateType("T")
                .operationType("7")
                .fineValue("10")
                .build();
    }

    private CreateBeneficiaryRequest buildCreateBeneficiaryRequest() {
        return CreateBeneficiaryRequest.builder()
                .agencyCode("6554")
                .neighborhoodCode("21702")
                .bankCode("237")
                .occupationCode("")
                .companyCode("2690967")
                .graceGroupCode("")
                .companyGroupCode("0")
                .tsLocalCode("0")
                .workplaceCode("")
                .allocationCode("")
                .tsAllocationCode("0")
                .municipalityCode("9369")
                .serviceMunicipalityCode("9369")
                .birthMunicipalityCode("9369")
                .residenceMunicipalityCode("9369")
                .issuingBodyCode("")
                .countryCode("0")
                .issuingCountryCode("0")
                .planCode("CORPCPENF")
                .originPlanCode("")
                .movementSituationCode("0")
                .layoutTypeCode("")
                .addressTypeCode("Rua")
                .operationTypeCode("1")
                .productTypeCode("")
                .userCode("SERVICO")
                .addressComplement("CASA ROSA")
                .admissionDate("2023-02-01")
                .marriageDate("2023-02-01")
                .identityIssuanceDate("2023-02-01")
                .inclusionDate("2024-01-10")
                .contributionStartDate("2024-01-10")
                .allocationDate("2024-01-10")
                .birthDate("1998-01-10")
                .cellphoneAreaCode("11")
                .dueDay("1")
                .billingAddress(true)
                .correspondenceAddress(true)
                .emailAddress("TESTE@TEST.COM")
                .residentialAddress(true)
                .maritalStatus("2")
                .excludeAddress(false)
                .referenceMonthYear("2024-01-11T13:10:01.439Z")
                .nationality("B")
                .associateName("SOUZA TADEU SANTOS")
                .neighborhoodName("")
                .cardName("SOUZA TADEU SANTOS")
                .cityName("")
                .addressName("DOUTOR MOURA RIBEIRO")
                .motherName("MARGARET BRENDA SANTOS DE OLIVEIRA")
                .fatherName("DANIEL SANTOS")
                .associateNumber("")
                .originAssociateNumber("")
                .operatorAssociateNumber("")
                .associateOrWalletNumber("")
                .zipCode("11070061")
                .cpfNumber("55876676004")
                .cellphoneNumber("99898866")
                .reimbursementAccountNumber("")
                .contractNumber("22994018275")
                .phoneAreaCode("11")
                .liveBirthDeclarationNumber("")
                .reimbursementAgencyDigit("")
                .reimbursementAccountDigit("")
                .addressNumber("309")
                .identityNumber("")
                .founderRegistrationNumber("")
                .companyRegistrationNumber("")
                .newCompanyRegistrationNumber("")
                .pisNumber("")
                .portabilityOriginProductNumber("")
                .originOperatorProductNumber("")
                .extensionNumber("")
                .batchSequentialNumber("0")
                .registrationSequentialNumber("")
                .movementSequentialNumber("0")
                .phoneNumber("")
                .uniqueHealthNumber("")
                .weight("0")
                .gender("M")
                .stateInitials("SP")
                .companySituation("0")
                .livesAbroad(false)
                .build();
    }

    private CreateDependentRequest buildCreateDependentRequest() {
        return CreateDependentRequest.builder()
                .agencyCode("6554")
                .neighborhoodCode("21702")
                .bankCode("237")
                .occupationCode("")
                .dependencyCode("1")
                .companyCode("2690967")
                .tsLocalCode("0")
                .allocationCode("")
                .tsAllocationCode("0")
                .municipalityCode("9369")
                .serviceMunicipalityCode("9369")
                .birthMunicipalityCode("9369")
                .residenceMunicipalityCode("9369")
                .issuingBodyCode("")
                .countryCode("0")
                .issuingCountryCode("0")
                .planCode("SSB")
                .originPlanCode("")
                .billingTypeCode("0")
                .addressTypeCode("Rua")
                .operationTypeCode("2")
                .tsHolderCode("0")
                .addressComplement("A")
                .marriageDate("1998-01-10")
                .identityIssuanceDate("1998-01-10")
                .inclusionDate("2024-01-10")
                .contributionStartDate("2024-01-10")
                .allocationDate("2024-01-10")
                .birthDate("2024-01-10")
                .cellphoneAreaCode("11")
                .dueDay("1")
                .isAdministrator(true)
                .billingAddress(true)
                .correspondenceAddress(true)
                .emailAddress("teste@testc.com")
                .residentialAddress(true)
                .maritalStatus("2")
                .excludeAddress(true)
                .requiresHealthDeclaration(true)
                .referenceMonthYear("2024-01-01")
                .nationality("B")
                .associateName("Marta Silva")
                .neighborhoodName("")
                .cardName("Marta Silva")
                .cityName("")
                .addressName("DOUTOR MOURA RIBEIRO")
                .motherName("Maria João")
                .fatherName("José Maria")
                .associateNumber("")
                .originAssociateNumber("")
                .operatorAssociateNumber("")
                .associateOrWalletHolderNumber("9940063532751004")
                .holderAssociateNumber("9940063532751004")
                .zipCode("11070061")
                .cpfNumber("15812212155")
                .cellphoneNumber("995848219")
                .reimbursementAccountNumber("")
                .contractNumber("59942288")
                .phoneAreaCode("11")
                .liveBirthDeclarationNumber("")
                .reimbursementAgencyDigit("")
                .reimbursementAccountDigit("")
                .addressNumber("11")
                .identityNumber("")
                .founderRegistrationNumber("")
                .companyRegistrationNumber("")
                .newCompanyRegistrationNumber("")
                .pisNumber("")
                .portabilityOriginProductNumber("")
                .originOperatorProductNumber("")
                .extensionNumber("")
                .registrationSequentialNumber("")
                .phoneNumber("")
                .uniqueHealthNumber("")
                .gender("F")
                .stateInitials("SP")
                .companySituation("0")
                .livesAbroad(false)
                .build();
    }

}
