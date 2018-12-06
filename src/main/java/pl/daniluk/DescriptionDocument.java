/*
 * An XML document type.
 * Localname: description
 * Namespace: http://xmlbeans.apache.org/samples/template/sampletemplate
 * Java type: pl.daniluk.DescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package pl.daniluk;


/**
 * A document containing one description(@http://xmlbeans.apache.org/samples/template/sampletemplate) element.
 *
 * This is a complex type.
 */
public interface DescriptionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DescriptionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sECFE4CE86D387AD19A9FA1F8F256C641").resolveHandle("descriptiond9d5doctype");
    
    /**
     * Gets the "description" element
     */
    pl.daniluk.DescriptionDocument.Description getDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(pl.daniluk.DescriptionDocument.Description description);
    
    /**
     * Appends and returns a new empty "description" element
     */
    pl.daniluk.DescriptionDocument.Description addNewDescription();
    
    /**
     * An XML description(@http://xmlbeans.apache.org/samples/template/sampletemplate).
     *
     * This is a complex type.
     */
    public interface Description extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Description.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sECFE4CE86D387AD19A9FA1F8F256C641").resolveHandle("descriptione26delemtype");
        
        /**
         * Gets array of all "short" elements
         */
        pl.daniluk.DescriptionDocument.Description.Short[] getShortArray();
        
        /**
         * Gets ith "short" element
         */
        pl.daniluk.DescriptionDocument.Description.Short getShortArray(int i);
        
        /**
         * Returns number of "short" element
         */
        int sizeOfShortArray();
        
        /**
         * Sets array of all "short" element
         */
        void setShortArray(pl.daniluk.DescriptionDocument.Description.Short[] xshortArray);
        
        /**
         * Sets ith "short" element
         */
        void setShortArray(int i, pl.daniluk.DescriptionDocument.Description.Short xshort);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "short" element
         */
        pl.daniluk.DescriptionDocument.Description.Short insertNewShort(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "short" element
         */
        pl.daniluk.DescriptionDocument.Description.Short addNewShort();
        
        /**
         * Removes the ith "short" element
         */
        void removeShort(int i);
        
        /**
         * Gets array of all "long" elements
         */
        pl.daniluk.DescriptionDocument.Description.Long[] getLongArray();
        
        /**
         * Gets ith "long" element
         */
        pl.daniluk.DescriptionDocument.Description.Long getLongArray(int i);
        
        /**
         * Returns number of "long" element
         */
        int sizeOfLongArray();
        
        /**
         * Sets array of all "long" element
         */
        void setLongArray(pl.daniluk.DescriptionDocument.Description.Long[] xlongArray);
        
        /**
         * Sets ith "long" element
         */
        void setLongArray(int i, pl.daniluk.DescriptionDocument.Description.Long xlong);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "long" element
         */
        pl.daniluk.DescriptionDocument.Description.Long insertNewLong(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "long" element
         */
        pl.daniluk.DescriptionDocument.Description.Long addNewLong();
        
        /**
         * Removes the ith "long" element
         */
        void removeLong(int i);
        
        /**
         * An XML short(@http://xmlbeans.apache.org/samples/template/sampletemplate).
         *
         * This is a complex type.
         */
        public interface Short extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Short.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sECFE4CE86D387AD19A9FA1F8F256C641").resolveHandle("short4285elemtype");
            
            /**
             * Gets the "intro" element
             */
            java.lang.String getIntro();
            
            /**
             * Gets (as xml) the "intro" element
             */
            org.apache.xmlbeans.XmlString xgetIntro();
            
            /**
             * True if has "intro" element
             */
            boolean isSetIntro();
            
            /**
             * Sets the "intro" element
             */
            void setIntro(java.lang.String intro);
            
            /**
             * Sets (as xml) the "intro" element
             */
            void xsetIntro(org.apache.xmlbeans.XmlString intro);
            
            /**
             * Unsets the "intro" element
             */
            void unsetIntro();
            
            /**
             * Gets the "content" element
             */
            java.lang.String getContent();
            
            /**
             * Gets (as xml) the "content" element
             */
            org.apache.xmlbeans.XmlString xgetContent();
            
            /**
             * True if has "content" element
             */
            boolean isSetContent();
            
            /**
             * Sets the "content" element
             */
            void setContent(java.lang.String content);
            
            /**
             * Sets (as xml) the "content" element
             */
            void xsetContent(org.apache.xmlbeans.XmlString content);
            
            /**
             * Unsets the "content" element
             */
            void unsetContent();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static pl.daniluk.DescriptionDocument.Description.Short newInstance() {
                  return (pl.daniluk.DescriptionDocument.Description.Short) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static pl.daniluk.DescriptionDocument.Description.Short newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (pl.daniluk.DescriptionDocument.Description.Short) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML long(@http://xmlbeans.apache.org/samples/template/sampletemplate).
         *
         * This is a complex type.
         */
        public interface Long extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Long.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sECFE4CE86D387AD19A9FA1F8F256C641").resolveHandle("longe455elemtype");
            
            /**
             * Gets the "intro" element
             */
            java.lang.String getIntro();
            
            /**
             * Gets (as xml) the "intro" element
             */
            org.apache.xmlbeans.XmlString xgetIntro();
            
            /**
             * True if has "intro" element
             */
            boolean isSetIntro();
            
            /**
             * Sets the "intro" element
             */
            void setIntro(java.lang.String intro);
            
            /**
             * Sets (as xml) the "intro" element
             */
            void xsetIntro(org.apache.xmlbeans.XmlString intro);
            
            /**
             * Unsets the "intro" element
             */
            void unsetIntro();
            
            /**
             * Gets the "content" element
             */
            java.lang.String getContent();
            
            /**
             * Gets (as xml) the "content" element
             */
            org.apache.xmlbeans.XmlString xgetContent();
            
            /**
             * True if has "content" element
             */
            boolean isSetContent();
            
            /**
             * Sets the "content" element
             */
            void setContent(java.lang.String content);
            
            /**
             * Sets (as xml) the "content" element
             */
            void xsetContent(org.apache.xmlbeans.XmlString content);
            
            /**
             * Unsets the "content" element
             */
            void unsetContent();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static pl.daniluk.DescriptionDocument.Description.Long newInstance() {
                  return (pl.daniluk.DescriptionDocument.Description.Long) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static pl.daniluk.DescriptionDocument.Description.Long newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (pl.daniluk.DescriptionDocument.Description.Long) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static pl.daniluk.DescriptionDocument.Description newInstance() {
              return (pl.daniluk.DescriptionDocument.Description) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static pl.daniluk.DescriptionDocument.Description newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (pl.daniluk.DescriptionDocument.Description) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static pl.daniluk.DescriptionDocument newInstance() {
          return (pl.daniluk.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static pl.daniluk.DescriptionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (pl.daniluk.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static pl.daniluk.DescriptionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (pl.daniluk.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static pl.daniluk.DescriptionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (pl.daniluk.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static pl.daniluk.DescriptionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (pl.daniluk.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static pl.daniluk.DescriptionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (pl.daniluk.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static pl.daniluk.DescriptionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (pl.daniluk.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static pl.daniluk.DescriptionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (pl.daniluk.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static pl.daniluk.DescriptionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (pl.daniluk.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static pl.daniluk.DescriptionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (pl.daniluk.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static pl.daniluk.DescriptionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (pl.daniluk.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static pl.daniluk.DescriptionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (pl.daniluk.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static pl.daniluk.DescriptionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (pl.daniluk.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static pl.daniluk.DescriptionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (pl.daniluk.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static pl.daniluk.DescriptionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (pl.daniluk.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static pl.daniluk.DescriptionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (pl.daniluk.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static pl.daniluk.DescriptionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (pl.daniluk.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static pl.daniluk.DescriptionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (pl.daniluk.DescriptionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
