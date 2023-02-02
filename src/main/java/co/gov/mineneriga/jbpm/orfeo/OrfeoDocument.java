package co.gov.mineneriga.jbpm.orfeo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class OrfeoDocument implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "NUMERO")
	private java.lang.String NUMERO;
	@org.kie.api.definition.type.Label(value = "FECHA")
	private java.lang.String FECHA;
	@org.kie.api.definition.type.Label(value = "ASUNTO")
	private java.lang.String ASUNTO;
	@org.kie.api.definition.type.Label(value = "TIPO_DOCUMENTO")
	private java.lang.String TIPO_DOCUMENTO;
	@org.kie.api.definition.type.Label(value = "NOMBRE_DEPENDENCIA")
	private java.lang.String NOMBRE_DEPENDENCIA;
	@org.kie.api.definition.type.Label(value = "NOMBRE_USUAIO")
	private java.lang.String NOMBRE_USUAIO;
	@org.kie.api.definition.type.Label(value = "DOCUMENTO_USUARIO")
	private java.lang.String DOCUMENTO_USUARIO;
	@org.kie.api.definition.type.Label(value = "FIRMA_DIGITAL")
	private java.lang.String FIRMA_DIGITAL;
	@org.kie.api.definition.type.Label(value = "ES_ANEXO")
	private java.lang.String ES_ANEXO;
	

	public OrfeoDocument() {
	}

	public java.lang.String getNUMERO() {
		return this.NUMERO;
	}

	public void setNUMERO(java.lang.String NUMERO) {
		this.NUMERO = NUMERO;
	}

	public java.lang.String getFECHA() {
		return this.FECHA;
	}

	public void setFECHA(java.lang.String FECHA) {
		this.FECHA = FECHA;
	}

	public java.lang.String getASUNTO() {
		return this.ASUNTO;
	}

	public void setASUNTO(java.lang.String ASUNTO) {
		this.ASUNTO = ASUNTO;
	}

	public java.lang.String getTIPO_DOCUMENTO() {
		return this.TIPO_DOCUMENTO;
	}

	public void setTIPO_DOCUMENTO(java.lang.String TIPO_DOCUMENTO) {
		this.TIPO_DOCUMENTO = TIPO_DOCUMENTO;
	}

	public java.lang.String getNOMBRE_USUAIO() {
		return this.NOMBRE_USUAIO;
	}

	public void setNOMBRE_USUAIO(java.lang.String NOMBRE_USUAIO) {
		this.NOMBRE_USUAIO = NOMBRE_USUAIO;
	}

	public java.lang.String getDOCUMENTO_USUARIO() {
		return this.DOCUMENTO_USUARIO;
	}

	public void setDOCUMENTO_USUARIO(java.lang.String DOCUMENTO_USUARIO) {
		this.DOCUMENTO_USUARIO = DOCUMENTO_USUARIO;
	}

	public java.lang.String getFIRMA_DIGITAL() {
		return this.FIRMA_DIGITAL;
	}

	public void setFIRMA_DIGITAL(java.lang.String FIRMA_DIGITAL) {
		this.FIRMA_DIGITAL = FIRMA_DIGITAL;
	}

	public java.lang.String getES_ANEXO() {
		return this.ES_ANEXO;
	}

	public void setES_ANEXO(java.lang.String ES_ANEXO) {
		this.ES_ANEXO = ES_ANEXO;
	}

	public java.lang.String getNOMBRE_DEPENDENCIA() {
		return this.NOMBRE_DEPENDENCIA;
	}

	public void setNOMBRE_DEPENDENCIA(java.lang.String NOMBRE_DEPENDENCIA) {
		this.NOMBRE_DEPENDENCIA = NOMBRE_DEPENDENCIA;
	}

	public OrfeoDocument(java.lang.String NUMERO, java.lang.String FECHA,
			java.lang.String ASUNTO, java.lang.String TIPO_DOCUMENTO,
			java.lang.String NOMBRE_USUAIO, java.lang.String DOCUMENTO_USUARIO,
			java.lang.String FIRMA_DIGITAL, java.lang.String ES_ANEXO,
			java.lang.String NOMBRE_DEPENDENCIA) {
		this.NUMERO = NUMERO;
		this.FECHA = FECHA;
		this.ASUNTO = ASUNTO;
		this.TIPO_DOCUMENTO = TIPO_DOCUMENTO;
		this.NOMBRE_USUAIO = NOMBRE_USUAIO;
		this.DOCUMENTO_USUARIO = DOCUMENTO_USUARIO;
		this.FIRMA_DIGITAL = FIRMA_DIGITAL;
		this.ES_ANEXO = ES_ANEXO;
		this.NOMBRE_DEPENDENCIA = NOMBRE_DEPENDENCIA;
	}

}