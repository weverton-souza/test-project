package com.example.demo.mapper;

import com.example.demo.client.BeneficiaryClientRequest;
import com.example.demo.to.CreateBeneficiaryRequest;
import com.example.demo.to.CreateDependentRequest;
import com.example.demo.to.DeleteBeneficiaryRequest;
import com.example.demo.to.PlanChangeRequest;
import com.example.demo.to.UpdateBeneficiaryRequest;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.stream.Collectors;

public class BeneficiaryMapper {
    private static BeneficiaryClientRequest.BeneficiaryClientRequestBuilder<?, ?> populateCommonFields(Object request) {
        BeneficiaryClientRequest.BeneficiaryClientRequestBuilder<?, ?> builder = BeneficiaryClientRequest.builder();
        Field[] fields = request.getClass().getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Method builderMethod =
                        BeneficiaryClientRequest.BeneficiaryClientRequestBuilder.class.getMethod(field.getName(), field.getType());

                builderMethod.invoke(builder, field.get(request));
            } catch (NoSuchMethodException e) {
                // Campo não existe no builder, ignorar

            } catch (Exception e) {
                // Tratar outros erros
            }
        }
        return builder;
    }

    public static BeneficiaryClientRequest convert(CreateBeneficiaryRequest request) {
        return populateCommonFields(request).build();
    }

    public static BeneficiaryClientRequest convert(UpdateBeneficiaryRequest request) {
        BeneficiaryClientRequest.BeneficiaryClientRequestBuilder<?, ?> builder = populateCommonFields(request);
        if (request.getPreExistingDiseases() != null) {
            builder.preExistingDiseases(request.getPreExistingDiseases().stream()
                    .map(disease -> BeneficiaryClientRequest.PreExistingDisease.builder()
                            .diseaseInternationalCode(disease.getDiseaseInternationalCode())
                            .diseaseName(disease.getDiseaseName())
                            .movementSequentialNumber(disease.getMovementSequentialNumber())
                            .build())
                    .collect(Collectors.toList()));
        }
        return builder.build();
    }

    public static BeneficiaryClientRequest convert(DeleteBeneficiaryRequest request) {
        return populateCommonFields(request).build();
    }

    public static BeneficiaryClientRequest convert(CreateDependentRequest request) {
        return populateCommonFields(request).build();
    }

    public static BeneficiaryClientRequest convert(PlanChangeRequest request) {
        return populateCommonFields(request).build();
    }
}
