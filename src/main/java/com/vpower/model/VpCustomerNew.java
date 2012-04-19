package com.vpower.model;

import com.vpower.model.BaseObject;

import org.compass.annotations.Searchable;
import org.compass.annotations.SearchableComponent;
import org.compass.annotations.SearchableId;
import org.compass.annotations.SearchableProperty;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;

@Entity
@Table(name="VP_CUSTOMER_NEW",catalog="biz")
@Searchable
@XmlRootElement
public class VpCustomerNew extends BaseObject implements Serializable {
    private Long seq;
    private String ADept;
    private String AFiller;
    private Date AFilldate;
    private String ABanktype;
    private String ACustid;
    private String ACustname;
    private String ACustadd;
    private String APhonenum;
    private String AContact;
    private String ABelongtoname;
    private String AContractno;
    private Date ABegindate;
    private String ACustnewold;
    private Float CPayselfratio;
    private Float CPayselfprice;
    private String CPayselfnum;
    private String CPayselfcust;
    private String CPayselftype;
    private String CPaymethod;
    private Float CPayotherratio;
    private Float CPayotherprice;
    private String CPayothernum;
    private String CPayothercust;
    private String CPayothertype;
    private String CPayothermethod;
    private String CPayselffreq;
    private String CPayotherfreq;
    private String DResult;
    private String ZMktdealer;
    private String ZBranchdeals;
    private String ZZhuren;

    @Id @GeneratedValue(strategy=IDENTITY) @SearchableId    
    public Long getSeq() {
        return this.seq;
    }
    
    public void setSeq(Long seq) {
        this.seq = seq;
    }
    
    @Column(name="A_DEPT", length=64)
    @SearchableProperty
    public String getADept() {
        return this.ADept;
    }
    
    public void setADept(String ADept) {
        this.ADept = ADept;
    }
    
    @Column(name="A_FILLER", length=10)
    @SearchableProperty
    public String getAFiller() {
        return this.AFiller;
    }
    
    public void setAFiller(String AFiller) {
        this.AFiller = AFiller;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="A_FILLDATE", length=10)
    @SearchableProperty
    public Date getAFilldate() {
        return this.AFilldate;
    }
    
    public void setAFilldate(Date AFilldate) {
        this.AFilldate = AFilldate;
    }
    
    @Column(name="A_BANKTYPE", length=20)
    @SearchableProperty
    public String getABanktype() {
        return this.ABanktype;
    }
    
    public void setABanktype(String ABanktype) {
        this.ABanktype = ABanktype;
    }
    
    @Column(name="A_CUSTID", length=10)
    @SearchableProperty
    public String getACustid() {
        return this.ACustid;
    }
    
    public void setACustid(String ACustid) {
        this.ACustid = ACustid;
    }
    
    @Column(name="A_CUSTNAME", length=64)
    @SearchableProperty
    public String getACustname() {
        return this.ACustname;
    }
    
    public void setACustname(String ACustname) {
        this.ACustname = ACustname;
    }
    
    @Column(name="A_CUSTADD", length=128)
    @SearchableProperty
    public String getACustadd() {
        return this.ACustadd;
    }
    
    public void setACustadd(String ACustadd) {
        this.ACustadd = ACustadd;
    }
    
    @Column(name="A_PHONENUM", length=64)
    @SearchableProperty
    public String getAPhonenum() {
        return this.APhonenum;
    }
    
    public void setAPhonenum(String APhonenum) {
        this.APhonenum = APhonenum;
    }
    
    @Column(name="A_CONTACT", length=64)
    @SearchableProperty
    public String getAContact() {
        return this.AContact;
    }
    
    public void setAContact(String AContact) {
        this.AContact = AContact;
    }
    
    @Column(name="A_BELONGTONAME", length=128)
    @SearchableProperty
    public String getABelongtoname() {
        return this.ABelongtoname;
    }
    
    public void setABelongtoname(String ABelongtoname) {
        this.ABelongtoname = ABelongtoname;
    }
    
    @Column(name="A_CONTRACTNO", length=32)
    @SearchableProperty
    public String getAContractno() {
        return this.AContractno;
    }
    
    public void setAContractno(String AContractno) {
        this.AContractno = AContractno;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="A_BEGINDATE", length=10)
    @SearchableProperty
    public Date getABegindate() {
        return this.ABegindate;
    }
    
    public void setABegindate(Date ABegindate) {
        this.ABegindate = ABegindate;
    }
    
    @Column(name="A_CUSTNEWOLD", length=20)
    @SearchableProperty
    public String getACustnewold() {
        return this.ACustnewold;
    }
    
    public void setACustnewold(String ACustnewold) {
        this.ACustnewold = ACustnewold;
    }
    
    @Column(name="C_PAYSELFRATIO", precision=12, scale=0)
    @SearchableProperty
    public Float getCPayselfratio() {
        return this.CPayselfratio;
    }
    
    public void setCPayselfratio(Float CPayselfratio) {
        this.CPayselfratio = CPayselfratio;
    }
    
    @Column(name="C_PAYSELFPRICE", precision=12, scale=0)
    @SearchableProperty
    public Float getCPayselfprice() {
        return this.CPayselfprice;
    }
    
    public void setCPayselfprice(Float CPayselfprice) {
        this.CPayselfprice = CPayselfprice;
    }
    
    @Column(name="C_PAYSELFNUM", length=10)
    @SearchableProperty
    public String getCPayselfnum() {
        return this.CPayselfnum;
    }
    
    public void setCPayselfnum(String CPayselfnum) {
        this.CPayselfnum = CPayselfnum;
    }
    
    @Column(name="C_PAYSELFCUST", length=64)
    @SearchableProperty
    public String getCPayselfcust() {
        return this.CPayselfcust;
    }
    
    public void setCPayselfcust(String CPayselfcust) {
        this.CPayselfcust = CPayselfcust;
    }
    
    @Column(name="C_PAYSELFTYPE", length=10)
    @SearchableProperty
    public String getCPayselftype() {
        return this.CPayselftype;
    }
    
    public void setCPayselftype(String CPayselftype) {
        this.CPayselftype = CPayselftype;
    }
    
    @Column(name="C_PAYMETHOD", length=10)
    @SearchableProperty
    public String getCPaymethod() {
        return this.CPaymethod;
    }
    
    public void setCPaymethod(String CPaymethod) {
        this.CPaymethod = CPaymethod;
    }
    
    @Column(name="C_PAYOTHERRATIO", precision=12, scale=0)
    @SearchableProperty
    public Float getCPayotherratio() {
        return this.CPayotherratio;
    }
    
    public void setCPayotherratio(Float CPayotherratio) {
        this.CPayotherratio = CPayotherratio;
    }
    
    @Column(name="C_PAYOTHERPRICE", precision=12, scale=0)
    @SearchableProperty
    public Float getCPayotherprice() {
        return this.CPayotherprice;
    }
    
    public void setCPayotherprice(Float CPayotherprice) {
        this.CPayotherprice = CPayotherprice;
    }
    
    @Column(name="C_PAYOTHERNUM", length=10)
    @SearchableProperty
    public String getCPayothernum() {
        return this.CPayothernum;
    }
    
    public void setCPayothernum(String CPayothernum) {
        this.CPayothernum = CPayothernum;
    }
    
    @Column(name="C_PAYOTHERCUST", length=64)
    @SearchableProperty
    public String getCPayothercust() {
        return this.CPayothercust;
    }
    
    public void setCPayothercust(String CPayothercust) {
        this.CPayothercust = CPayothercust;
    }
    
    @Column(name="C_PAYOTHERTYPE", length=10)
    @SearchableProperty
    public String getCPayothertype() {
        return this.CPayothertype;
    }
    
    public void setCPayothertype(String CPayothertype) {
        this.CPayothertype = CPayothertype;
    }
    
    @Column(name="C_PAYOTHERMETHOD", length=10)
    @SearchableProperty
    public String getCPayothermethod() {
        return this.CPayothermethod;
    }
    
    public void setCPayothermethod(String CPayothermethod) {
        this.CPayothermethod = CPayothermethod;
    }
    
    @Column(name="C_PAYSELFFREQ", length=20)
    @SearchableProperty
    public String getCPayselffreq() {
        return this.CPayselffreq;
    }
    
    public void setCPayselffreq(String CPayselffreq) {
        this.CPayselffreq = CPayselffreq;
    }
    
    @Column(name="C_PAYOTHERFREQ", length=20)
    @SearchableProperty
    public String getCPayotherfreq() {
        return this.CPayotherfreq;
    }
    
    public void setCPayotherfreq(String CPayotherfreq) {
        this.CPayotherfreq = CPayotherfreq;
    }
    
    @Column(name="D_RESULT", length=20)
    @SearchableProperty
    public String getDResult() {
        return this.DResult;
    }
    
    public void setDResult(String DResult) {
        this.DResult = DResult;
    }
    
    @Column(name="Z_MKTDEALER", length=20)
    @SearchableProperty
    public String getZMktdealer() {
        return this.ZMktdealer;
    }
    
    public void setZMktdealer(String ZMktdealer) {
        this.ZMktdealer = ZMktdealer;
    }
    
    @Column(name="Z_BRANCHDEALS", length=64)
    @SearchableProperty
    public String getZBranchdeals() {
        return this.ZBranchdeals;
    }
    
    public void setZBranchdeals(String ZBranchdeals) {
        this.ZBranchdeals = ZBranchdeals;
    }
    
    @Column(name="Z_ZHUREN", length=10)
    @SearchableProperty
    public String getZZhuren() {
        return this.ZZhuren;
    }
    
    public void setZZhuren(String ZZhuren) {
        this.ZZhuren = ZZhuren;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VpCustomerNew pojo = (VpCustomerNew) o;

        if (ADept != null ? !ADept.equals(pojo.ADept) : pojo.ADept != null) return false;
        if (AFiller != null ? !AFiller.equals(pojo.AFiller) : pojo.AFiller != null) return false;
        if (AFilldate != null ? !AFilldate.equals(pojo.AFilldate) : pojo.AFilldate != null) return false;
        if (ABanktype != null ? !ABanktype.equals(pojo.ABanktype) : pojo.ABanktype != null) return false;
        if (ACustid != null ? !ACustid.equals(pojo.ACustid) : pojo.ACustid != null) return false;
        if (ACustname != null ? !ACustname.equals(pojo.ACustname) : pojo.ACustname != null) return false;
        if (ACustadd != null ? !ACustadd.equals(pojo.ACustadd) : pojo.ACustadd != null) return false;
        if (APhonenum != null ? !APhonenum.equals(pojo.APhonenum) : pojo.APhonenum != null) return false;
        if (AContact != null ? !AContact.equals(pojo.AContact) : pojo.AContact != null) return false;
        if (ABelongtoname != null ? !ABelongtoname.equals(pojo.ABelongtoname) : pojo.ABelongtoname != null) return false;
        if (AContractno != null ? !AContractno.equals(pojo.AContractno) : pojo.AContractno != null) return false;
        if (ABegindate != null ? !ABegindate.equals(pojo.ABegindate) : pojo.ABegindate != null) return false;
        if (ACustnewold != null ? !ACustnewold.equals(pojo.ACustnewold) : pojo.ACustnewold != null) return false;
        if (CPayselfratio != null ? !CPayselfratio.equals(pojo.CPayselfratio) : pojo.CPayselfratio != null) return false;
        if (CPayselfprice != null ? !CPayselfprice.equals(pojo.CPayselfprice) : pojo.CPayselfprice != null) return false;
        if (CPayselfnum != null ? !CPayselfnum.equals(pojo.CPayselfnum) : pojo.CPayselfnum != null) return false;
        if (CPayselfcust != null ? !CPayselfcust.equals(pojo.CPayselfcust) : pojo.CPayselfcust != null) return false;
        if (CPayselftype != null ? !CPayselftype.equals(pojo.CPayselftype) : pojo.CPayselftype != null) return false;
        if (CPaymethod != null ? !CPaymethod.equals(pojo.CPaymethod) : pojo.CPaymethod != null) return false;
        if (CPayotherratio != null ? !CPayotherratio.equals(pojo.CPayotherratio) : pojo.CPayotherratio != null) return false;
        if (CPayotherprice != null ? !CPayotherprice.equals(pojo.CPayotherprice) : pojo.CPayotherprice != null) return false;
        if (CPayothernum != null ? !CPayothernum.equals(pojo.CPayothernum) : pojo.CPayothernum != null) return false;
        if (CPayothercust != null ? !CPayothercust.equals(pojo.CPayothercust) : pojo.CPayothercust != null) return false;
        if (CPayothertype != null ? !CPayothertype.equals(pojo.CPayothertype) : pojo.CPayothertype != null) return false;
        if (CPayothermethod != null ? !CPayothermethod.equals(pojo.CPayothermethod) : pojo.CPayothermethod != null) return false;
        if (CPayselffreq != null ? !CPayselffreq.equals(pojo.CPayselffreq) : pojo.CPayselffreq != null) return false;
        if (CPayotherfreq != null ? !CPayotherfreq.equals(pojo.CPayotherfreq) : pojo.CPayotherfreq != null) return false;
        if (DResult != null ? !DResult.equals(pojo.DResult) : pojo.DResult != null) return false;
        if (ZMktdealer != null ? !ZMktdealer.equals(pojo.ZMktdealer) : pojo.ZMktdealer != null) return false;
        if (ZBranchdeals != null ? !ZBranchdeals.equals(pojo.ZBranchdeals) : pojo.ZBranchdeals != null) return false;
        if (ZZhuren != null ? !ZZhuren.equals(pojo.ZZhuren) : pojo.ZZhuren != null) return false;

        return true;
    }

    public int hashCode() {
        int result = 0;
        result = (ADept != null ? ADept.hashCode() : 0);
        result = 31 * result + (AFiller != null ? AFiller.hashCode() : 0);
        result = 31 * result + (AFilldate != null ? AFilldate.hashCode() : 0);
        result = 31 * result + (ABanktype != null ? ABanktype.hashCode() : 0);
        result = 31 * result + (ACustid != null ? ACustid.hashCode() : 0);
        result = 31 * result + (ACustname != null ? ACustname.hashCode() : 0);
        result = 31 * result + (ACustadd != null ? ACustadd.hashCode() : 0);
        result = 31 * result + (APhonenum != null ? APhonenum.hashCode() : 0);
        result = 31 * result + (AContact != null ? AContact.hashCode() : 0);
        result = 31 * result + (ABelongtoname != null ? ABelongtoname.hashCode() : 0);
        result = 31 * result + (AContractno != null ? AContractno.hashCode() : 0);
        result = 31 * result + (ABegindate != null ? ABegindate.hashCode() : 0);
        result = 31 * result + (ACustnewold != null ? ACustnewold.hashCode() : 0);
        result = 31 * result + (CPayselfratio != null ? CPayselfratio.hashCode() : 0);
        result = 31 * result + (CPayselfprice != null ? CPayselfprice.hashCode() : 0);
        result = 31 * result + (CPayselfnum != null ? CPayselfnum.hashCode() : 0);
        result = 31 * result + (CPayselfcust != null ? CPayselfcust.hashCode() : 0);
        result = 31 * result + (CPayselftype != null ? CPayselftype.hashCode() : 0);
        result = 31 * result + (CPaymethod != null ? CPaymethod.hashCode() : 0);
        result = 31 * result + (CPayotherratio != null ? CPayotherratio.hashCode() : 0);
        result = 31 * result + (CPayotherprice != null ? CPayotherprice.hashCode() : 0);
        result = 31 * result + (CPayothernum != null ? CPayothernum.hashCode() : 0);
        result = 31 * result + (CPayothercust != null ? CPayothercust.hashCode() : 0);
        result = 31 * result + (CPayothertype != null ? CPayothertype.hashCode() : 0);
        result = 31 * result + (CPayothermethod != null ? CPayothermethod.hashCode() : 0);
        result = 31 * result + (CPayselffreq != null ? CPayselffreq.hashCode() : 0);
        result = 31 * result + (CPayotherfreq != null ? CPayotherfreq.hashCode() : 0);
        result = 31 * result + (DResult != null ? DResult.hashCode() : 0);
        result = 31 * result + (ZMktdealer != null ? ZMktdealer.hashCode() : 0);
        result = 31 * result + (ZBranchdeals != null ? ZBranchdeals.hashCode() : 0);
        result = 31 * result + (ZZhuren != null ? ZZhuren.hashCode() : 0);

        return result;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer(getClass().getSimpleName());

        sb.append(" [");
        sb.append("seq").append("='").append(getSeq()).append("', ");
        sb.append("ADept").append("='").append(getADept()).append("', ");
        sb.append("AFiller").append("='").append(getAFiller()).append("', ");
        sb.append("AFilldate").append("='").append(getAFilldate()).append("', ");
        sb.append("ABanktype").append("='").append(getABanktype()).append("', ");
        sb.append("ACustid").append("='").append(getACustid()).append("', ");
        sb.append("ACustname").append("='").append(getACustname()).append("', ");
        sb.append("ACustadd").append("='").append(getACustadd()).append("', ");
        sb.append("APhonenum").append("='").append(getAPhonenum()).append("', ");
        sb.append("AContact").append("='").append(getAContact()).append("', ");
        sb.append("ABelongtoname").append("='").append(getABelongtoname()).append("', ");
        sb.append("AContractno").append("='").append(getAContractno()).append("', ");
        sb.append("ABegindate").append("='").append(getABegindate()).append("', ");
        sb.append("ACustnewold").append("='").append(getACustnewold()).append("', ");
        sb.append("CPayselfratio").append("='").append(getCPayselfratio()).append("', ");
        sb.append("CPayselfprice").append("='").append(getCPayselfprice()).append("', ");
        sb.append("CPayselfnum").append("='").append(getCPayselfnum()).append("', ");
        sb.append("CPayselfcust").append("='").append(getCPayselfcust()).append("', ");
        sb.append("CPayselftype").append("='").append(getCPayselftype()).append("', ");
        sb.append("CPaymethod").append("='").append(getCPaymethod()).append("', ");
        sb.append("CPayotherratio").append("='").append(getCPayotherratio()).append("', ");
        sb.append("CPayotherprice").append("='").append(getCPayotherprice()).append("', ");
        sb.append("CPayothernum").append("='").append(getCPayothernum()).append("', ");
        sb.append("CPayothercust").append("='").append(getCPayothercust()).append("', ");
        sb.append("CPayothertype").append("='").append(getCPayothertype()).append("', ");
        sb.append("CPayothermethod").append("='").append(getCPayothermethod()).append("', ");
        sb.append("CPayselffreq").append("='").append(getCPayselffreq()).append("', ");
        sb.append("CPayotherfreq").append("='").append(getCPayotherfreq()).append("', ");
        sb.append("DResult").append("='").append(getDResult()).append("', ");
        sb.append("ZMktdealer").append("='").append(getZMktdealer()).append("', ");
        sb.append("ZBranchdeals").append("='").append(getZBranchdeals()).append("', ");
        sb.append("ZZhuren").append("='").append(getZZhuren()).append("'");
        sb.append("]");
      
        return sb.toString();
    }

}
