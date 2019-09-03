package com.vega.springit.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Comments extends Auditable {

    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String body;

    //link
    @ManyToOne
    @NonNull
    private Link link;

    public Comments(@NonNull String body, @NonNull Link link) {
        this.body = body;
        this.link = link;
    }
}
