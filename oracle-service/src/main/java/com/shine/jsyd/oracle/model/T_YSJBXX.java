package com.shine.jsyd.oracle.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class T_YSJBXX {
    @Id
    private String xm_guid;
    @Column(name = "xs_dm")
    private String xs_dm;
    @Column(name = "xm_xh")
    private int xm_xh;
    @Column(name = "zb_lx")
    private String zb_lx;

}
