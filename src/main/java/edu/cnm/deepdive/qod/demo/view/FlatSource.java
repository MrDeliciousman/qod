package edu.cnm.deepdive.qod.demo.view;

import java.util.Date;
import java.util.UUID;

public interface FlatSource {

  UUID getId();

  Date getCreated();

  String getName();

}
