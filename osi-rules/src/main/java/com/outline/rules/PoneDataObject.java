package com.outline.rules;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class PoneDataObject implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Person Id")
   private java.lang.Integer id;
   @org.kie.api.definition.type.Label(value = "Person Name")
   private java.lang.String name;

   public PoneDataObject()
   {
   }

   public java.lang.Integer getId()
   {
      return this.id;
   }

   public void setId(java.lang.Integer id)
   {
      this.id = id;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public PoneDataObject(java.lang.Integer id, java.lang.String name)
   {
      this.id = id;
      this.name = name;
   }

}