package org.vamdc.kida.dao.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _ImportThreeBodyChannel was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ImportThreeBodyChannel extends CayenneDataObject {

    public static final String APPLICATION_PROPERTY = "application";
    public static final String CREATED_AT_PROPERTY = "createdAt";
    public static final String FC_A_PROPERTY = "fcA";
    public static final String FC_B_PROPERTY = "fcB";
    public static final String FC_BIBTEX_PROPERTY = "fcBibtex";
    public static final String FC_BIBTEX_FILE_PROPERTY = "fcBibtexFile";
    public static final String FC_C_PROPERTY = "fcC";
    public static final String FC_D_PROPERTY = "fcD";
    public static final String FC_DATABASE_PROPERTY = "fcDatabase";
    public static final String FC_DESCRIPTION_PROPERTY = "fcDescription";
    public static final String FC_F0_PROPERTY = "fcF0";
    public static final String FC_FORMULA_PROPERTY = "fcFormula";
    public static final String FC_METHOD_PROPERTY = "fcMethod";
    public static final String FC_ORIGIN_PROPERTY = "fcOrigin";
    public static final String FC_TYPE_UNCERT_PROPERTY = "fcTypeUncert";
    public static final String FORMULA_PROPERTY = "formula";
    public static final String ID_PROPERTY = "id";
    public static final String IS_PAUSE_PROPERTY = "isPause";
    public static final String K0ALPHA_PROPERTY = "k0Alpha";
    public static final String K0BETA_PROPERTY = "k0Beta";
    public static final String K0BIBTEX_PROPERTY = "k0Bibtex";
    public static final String K0BIBTEX_FILE_PROPERTY = "k0BibtexFile";
    public static final String K0DATABASE_PROPERTY = "k0Database";
    public static final String K0DESCRIPTION_PROPERTY = "k0Description";
    public static final String K0F0_PROPERTY = "k0F0";
    public static final String K0FORMULA_PROPERTY = "k0Formula";
    public static final String K0G_PROPERTY = "k0G";
    public static final String K0GAMMA_PROPERTY = "k0Gamma";
    public static final String K0METHOD_PROPERTY = "k0Method";
    public static final String K0ORIGIN_PROPERTY = "k0Origin";
    public static final String K0TYPE_UNCERT_PROPERTY = "k0TypeUncert";
    public static final String KINF_ALPHA_PROPERTY = "kinfAlpha";
    public static final String KINF_BETA_PROPERTY = "kinfBeta";
    public static final String KINF_BIBTEX_PROPERTY = "kinfBibtex";
    public static final String KINF_BIBTEX_FILE_PROPERTY = "kinfBibtexFile";
    public static final String KINF_DATABASE_PROPERTY = "kinfDatabase";
    public static final String KINF_DESCRIPTION_PROPERTY = "kinfDescription";
    public static final String KINF_F0_PROPERTY = "kinfF0";
    public static final String KINF_FORMULA_PROPERTY = "kinfFormula";
    public static final String KINF_G_PROPERTY = "kinfG";
    public static final String KINF_GAMMA_PROPERTY = "kinfGamma";
    public static final String KINF_METHOD_PROPERTY = "kinfMethod";
    public static final String KINF_ORIGIN_PROPERTY = "kinfOrigin";
    public static final String KINF_TYPE_UNCERT_PROPERTY = "kinfTypeUncert";
    public static final String PMAX_PROPERTY = "pmax";
    public static final String PMIN_PROPERTY = "pmin";
    public static final String PRODUCT1_PROPERTY = "product1";
    public static final String PRODUCT2_PROPERTY = "product2";
    public static final String PRODUCT3_PROPERTY = "product3";
    public static final String PRODUCT4_PROPERTY = "product4";
    public static final String PRODUCT5_PROPERTY = "product5";
    public static final String PRODUCT6_PROPERTY = "product6";
    public static final String REACTANT1_PROPERTY = "reactant1";
    public static final String REACTANT2_PROPERTY = "reactant2";
    public static final String REACTANT3_PROPERTY = "reactant3";
    public static final String TMAX_PROPERTY = "tmax";
    public static final String TMIN_PROPERTY = "tmin";
    public static final String UPDATED_AT_PROPERTY = "updatedAt";

    public static final String ID_PK_COLUMN = "id";

    public void setApplication(String application) {
        writeProperty("application", application);
    }
    public String getApplication() {
        return (String)readProperty("application");
    }

    public void setCreatedAt(Date createdAt) {
        writeProperty("createdAt", createdAt);
    }
    public Date getCreatedAt() {
        return (Date)readProperty("createdAt");
    }

    public void setFcA(String fcA) {
        writeProperty("fcA", fcA);
    }
    public String getFcA() {
        return (String)readProperty("fcA");
    }

    public void setFcB(String fcB) {
        writeProperty("fcB", fcB);
    }
    public String getFcB() {
        return (String)readProperty("fcB");
    }

    public void setFcBibtex(String fcBibtex) {
        writeProperty("fcBibtex", fcBibtex);
    }
    public String getFcBibtex() {
        return (String)readProperty("fcBibtex");
    }

    public void setFcBibtexFile(String fcBibtexFile) {
        writeProperty("fcBibtexFile", fcBibtexFile);
    }
    public String getFcBibtexFile() {
        return (String)readProperty("fcBibtexFile");
    }

    public void setFcC(String fcC) {
        writeProperty("fcC", fcC);
    }
    public String getFcC() {
        return (String)readProperty("fcC");
    }

    public void setFcD(String fcD) {
        writeProperty("fcD", fcD);
    }
    public String getFcD() {
        return (String)readProperty("fcD");
    }

    public void setFcDatabase(String fcDatabase) {
        writeProperty("fcDatabase", fcDatabase);
    }
    public String getFcDatabase() {
        return (String)readProperty("fcDatabase");
    }

    public void setFcDescription(String fcDescription) {
        writeProperty("fcDescription", fcDescription);
    }
    public String getFcDescription() {
        return (String)readProperty("fcDescription");
    }

    public void setFcF0(String fcF0) {
        writeProperty("fcF0", fcF0);
    }
    public String getFcF0() {
        return (String)readProperty("fcF0");
    }

    public void setFcFormula(String fcFormula) {
        writeProperty("fcFormula", fcFormula);
    }
    public String getFcFormula() {
        return (String)readProperty("fcFormula");
    }

    public void setFcMethod(String fcMethod) {
        writeProperty("fcMethod", fcMethod);
    }
    public String getFcMethod() {
        return (String)readProperty("fcMethod");
    }

    public void setFcOrigin(String fcOrigin) {
        writeProperty("fcOrigin", fcOrigin);
    }
    public String getFcOrigin() {
        return (String)readProperty("fcOrigin");
    }

    public void setFcTypeUncert(String fcTypeUncert) {
        writeProperty("fcTypeUncert", fcTypeUncert);
    }
    public String getFcTypeUncert() {
        return (String)readProperty("fcTypeUncert");
    }

    public void setFormula(String formula) {
        writeProperty("formula", formula);
    }
    public String getFormula() {
        return (String)readProperty("formula");
    }

    public void setId(Integer id) {
        writeProperty("id", id);
    }
    public Integer getId() {
        return (Integer)readProperty("id");
    }

    public void setIsPause(Integer isPause) {
        writeProperty("isPause", isPause);
    }
    public Integer getIsPause() {
        return (Integer)readProperty("isPause");
    }

    public void setK0Alpha(String k0Alpha) {
        writeProperty("k0Alpha", k0Alpha);
    }
    public String getK0Alpha() {
        return (String)readProperty("k0Alpha");
    }

    public void setK0Beta(String k0Beta) {
        writeProperty("k0Beta", k0Beta);
    }
    public String getK0Beta() {
        return (String)readProperty("k0Beta");
    }

    public void setK0Bibtex(String k0Bibtex) {
        writeProperty("k0Bibtex", k0Bibtex);
    }
    public String getK0Bibtex() {
        return (String)readProperty("k0Bibtex");
    }

    public void setK0BibtexFile(String k0BibtexFile) {
        writeProperty("k0BibtexFile", k0BibtexFile);
    }
    public String getK0BibtexFile() {
        return (String)readProperty("k0BibtexFile");
    }

    public void setK0Database(String k0Database) {
        writeProperty("k0Database", k0Database);
    }
    public String getK0Database() {
        return (String)readProperty("k0Database");
    }

    public void setK0Description(String k0Description) {
        writeProperty("k0Description", k0Description);
    }
    public String getK0Description() {
        return (String)readProperty("k0Description");
    }

    public void setK0F0(String k0F0) {
        writeProperty("k0F0", k0F0);
    }
    public String getK0F0() {
        return (String)readProperty("k0F0");
    }

    public void setK0Formula(String k0Formula) {
        writeProperty("k0Formula", k0Formula);
    }
    public String getK0Formula() {
        return (String)readProperty("k0Formula");
    }

    public void setK0G(String k0G) {
        writeProperty("k0G", k0G);
    }
    public String getK0G() {
        return (String)readProperty("k0G");
    }

    public void setK0Gamma(String k0Gamma) {
        writeProperty("k0Gamma", k0Gamma);
    }
    public String getK0Gamma() {
        return (String)readProperty("k0Gamma");
    }

    public void setK0Method(String k0Method) {
        writeProperty("k0Method", k0Method);
    }
    public String getK0Method() {
        return (String)readProperty("k0Method");
    }

    public void setK0Origin(String k0Origin) {
        writeProperty("k0Origin", k0Origin);
    }
    public String getK0Origin() {
        return (String)readProperty("k0Origin");
    }

    public void setK0TypeUncert(String k0TypeUncert) {
        writeProperty("k0TypeUncert", k0TypeUncert);
    }
    public String getK0TypeUncert() {
        return (String)readProperty("k0TypeUncert");
    }

    public void setKinfAlpha(String kinfAlpha) {
        writeProperty("kinfAlpha", kinfAlpha);
    }
    public String getKinfAlpha() {
        return (String)readProperty("kinfAlpha");
    }

    public void setKinfBeta(String kinfBeta) {
        writeProperty("kinfBeta", kinfBeta);
    }
    public String getKinfBeta() {
        return (String)readProperty("kinfBeta");
    }

    public void setKinfBibtex(String kinfBibtex) {
        writeProperty("kinfBibtex", kinfBibtex);
    }
    public String getKinfBibtex() {
        return (String)readProperty("kinfBibtex");
    }

    public void setKinfBibtexFile(String kinfBibtexFile) {
        writeProperty("kinfBibtexFile", kinfBibtexFile);
    }
    public String getKinfBibtexFile() {
        return (String)readProperty("kinfBibtexFile");
    }

    public void setKinfDatabase(String kinfDatabase) {
        writeProperty("kinfDatabase", kinfDatabase);
    }
    public String getKinfDatabase() {
        return (String)readProperty("kinfDatabase");
    }

    public void setKinfDescription(String kinfDescription) {
        writeProperty("kinfDescription", kinfDescription);
    }
    public String getKinfDescription() {
        return (String)readProperty("kinfDescription");
    }

    public void setKinfF0(String kinfF0) {
        writeProperty("kinfF0", kinfF0);
    }
    public String getKinfF0() {
        return (String)readProperty("kinfF0");
    }

    public void setKinfFormula(String kinfFormula) {
        writeProperty("kinfFormula", kinfFormula);
    }
    public String getKinfFormula() {
        return (String)readProperty("kinfFormula");
    }

    public void setKinfG(String kinfG) {
        writeProperty("kinfG", kinfG);
    }
    public String getKinfG() {
        return (String)readProperty("kinfG");
    }

    public void setKinfGamma(String kinfGamma) {
        writeProperty("kinfGamma", kinfGamma);
    }
    public String getKinfGamma() {
        return (String)readProperty("kinfGamma");
    }

    public void setKinfMethod(String kinfMethod) {
        writeProperty("kinfMethod", kinfMethod);
    }
    public String getKinfMethod() {
        return (String)readProperty("kinfMethod");
    }

    public void setKinfOrigin(String kinfOrigin) {
        writeProperty("kinfOrigin", kinfOrigin);
    }
    public String getKinfOrigin() {
        return (String)readProperty("kinfOrigin");
    }

    public void setKinfTypeUncert(String kinfTypeUncert) {
        writeProperty("kinfTypeUncert", kinfTypeUncert);
    }
    public String getKinfTypeUncert() {
        return (String)readProperty("kinfTypeUncert");
    }

    public void setPmax(String pmax) {
        writeProperty("pmax", pmax);
    }
    public String getPmax() {
        return (String)readProperty("pmax");
    }

    public void setPmin(String pmin) {
        writeProperty("pmin", pmin);
    }
    public String getPmin() {
        return (String)readProperty("pmin");
    }

    public void setProduct1(String product1) {
        writeProperty("product1", product1);
    }
    public String getProduct1() {
        return (String)readProperty("product1");
    }

    public void setProduct2(String product2) {
        writeProperty("product2", product2);
    }
    public String getProduct2() {
        return (String)readProperty("product2");
    }

    public void setProduct3(String product3) {
        writeProperty("product3", product3);
    }
    public String getProduct3() {
        return (String)readProperty("product3");
    }

    public void setProduct4(String product4) {
        writeProperty("product4", product4);
    }
    public String getProduct4() {
        return (String)readProperty("product4");
    }

    public void setProduct5(String product5) {
        writeProperty("product5", product5);
    }
    public String getProduct5() {
        return (String)readProperty("product5");
    }

    public void setProduct6(String product6) {
        writeProperty("product6", product6);
    }
    public String getProduct6() {
        return (String)readProperty("product6");
    }

    public void setReactant1(String reactant1) {
        writeProperty("reactant1", reactant1);
    }
    public String getReactant1() {
        return (String)readProperty("reactant1");
    }

    public void setReactant2(String reactant2) {
        writeProperty("reactant2", reactant2);
    }
    public String getReactant2() {
        return (String)readProperty("reactant2");
    }

    public void setReactant3(String reactant3) {
        writeProperty("reactant3", reactant3);
    }
    public String getReactant3() {
        return (String)readProperty("reactant3");
    }

    public void setTmax(String tmax) {
        writeProperty("tmax", tmax);
    }
    public String getTmax() {
        return (String)readProperty("tmax");
    }

    public void setTmin(String tmin) {
        writeProperty("tmin", tmin);
    }
    public String getTmin() {
        return (String)readProperty("tmin");
    }

    public void setUpdatedAt(Date updatedAt) {
        writeProperty("updatedAt", updatedAt);
    }
    public Date getUpdatedAt() {
        return (Date)readProperty("updatedAt");
    }

}
