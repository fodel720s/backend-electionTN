package com.isg.laidsoa.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Justificatif {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long idjustificatif;

     @NonNull
     private String Contenu;

     @NonNull
     private String typeact;

   /*  @ManyToOne
     private Activite activite;
     @ManyToOne
     private Candidat candidat;   */




     public Justificatif() {

     }

     public long getIdjustificatif() {
          return idjustificatif;
     }

     public void setIdjustificatif(long idjustificatif) {
          this.idjustificatif = idjustificatif;
     }

     public String getContenu() {
          return Contenu;
     }

     public void setContenu(String contenu) {
          Contenu = contenu;
     }

     public String getTypeact() {
          return typeact;
     }

     public void setTypeact(String typeact) {
          this.typeact = typeact;
     }

   /*  public Activite getActivite() {
          return activite;
     }

     public void setActivite(Activite activite) {
          this.activite = activite;
     }

     public Candidat getCandidat() {
          return candidat;
     }

     public void setCandidat(Candidat candidat) {
          this.candidat = candidat;
     }
*/



}
