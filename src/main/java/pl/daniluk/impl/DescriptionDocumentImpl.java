/*
 * An XML document type.
 * Localname: description
 * Namespace: http://xmlbeans.apache.org/samples/template/sampletemplate
 * Java type: pl.daniluk.DescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package pl.daniluk.impl;
/**
 * A document containing one description(@http://xmlbeans.apache.org/samples/template/sampletemplate) element.
 *
 * This is a complex type.
 */
public class DescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements pl.daniluk.DescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public DescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://xmlbeans.apache.org/samples/template/sampletemplate", "description");
    
    
    /**
     * Gets the "description" element
     */
    public pl.daniluk.DescriptionDocument.Description getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            pl.daniluk.DescriptionDocument.Description target = null;
            target = (pl.daniluk.DescriptionDocument.Description)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(pl.daniluk.DescriptionDocument.Description description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            pl.daniluk.DescriptionDocument.Description target = null;
            target = (pl.daniluk.DescriptionDocument.Description)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                target = (pl.daniluk.DescriptionDocument.Description)get_store().add_element_user(DESCRIPTION$0);
            }
            target.set(description);
        }
    }
    
    /**
     * Appends and returns a new empty "description" element
     */
    public pl.daniluk.DescriptionDocument.Description addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            pl.daniluk.DescriptionDocument.Description target = null;
            target = (pl.daniluk.DescriptionDocument.Description)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
    /**
     * An XML description(@http://xmlbeans.apache.org/samples/template/sampletemplate).
     *
     * This is a complex type.
     */
    public static class DescriptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements pl.daniluk.DescriptionDocument.Description
    {
        private static final long serialVersionUID = 1L;
        
        public DescriptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SHORT$0 = 
            new javax.xml.namespace.QName("http://xmlbeans.apache.org/samples/template/sampletemplate", "short");
        private static final javax.xml.namespace.QName LONG$2 = 
            new javax.xml.namespace.QName("http://xmlbeans.apache.org/samples/template/sampletemplate", "long");
        
        
        /**
         * Gets array of all "short" elements
         */
        public pl.daniluk.DescriptionDocument.Description.Short[] getShortArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SHORT$0, targetList);
                pl.daniluk.DescriptionDocument.Description.Short[] result = new pl.daniluk.DescriptionDocument.Description.Short[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "short" element
         */
        public pl.daniluk.DescriptionDocument.Description.Short getShortArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                pl.daniluk.DescriptionDocument.Description.Short target = null;
                target = (pl.daniluk.DescriptionDocument.Description.Short)get_store().find_element_user(SHORT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "short" element
         */
        public int sizeOfShortArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SHORT$0);
            }
        }
        
        /**
         * Sets array of all "short" element
         */
        public void setShortArray(pl.daniluk.DescriptionDocument.Description.Short[] xshortArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(xshortArray, SHORT$0);
            }
        }
        
        /**
         * Sets ith "short" element
         */
        public void setShortArray(int i, pl.daniluk.DescriptionDocument.Description.Short xshort)
        {
            synchronized (monitor())
            {
                check_orphaned();
                pl.daniluk.DescriptionDocument.Description.Short target = null;
                target = (pl.daniluk.DescriptionDocument.Description.Short)get_store().find_element_user(SHORT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(xshort);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "short" element
         */
        public pl.daniluk.DescriptionDocument.Description.Short insertNewShort(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                pl.daniluk.DescriptionDocument.Description.Short target = null;
                target = (pl.daniluk.DescriptionDocument.Description.Short)get_store().insert_element_user(SHORT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "short" element
         */
        public pl.daniluk.DescriptionDocument.Description.Short addNewShort()
        {
            synchronized (monitor())
            {
                check_orphaned();
                pl.daniluk.DescriptionDocument.Description.Short target = null;
                target = (pl.daniluk.DescriptionDocument.Description.Short)get_store().add_element_user(SHORT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "short" element
         */
        public void removeShort(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SHORT$0, i);
            }
        }
        
        /**
         * Gets array of all "long" elements
         */
        public pl.daniluk.DescriptionDocument.Description.Long[] getLongArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LONG$2, targetList);
                pl.daniluk.DescriptionDocument.Description.Long[] result = new pl.daniluk.DescriptionDocument.Description.Long[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "long" element
         */
        public pl.daniluk.DescriptionDocument.Description.Long getLongArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                pl.daniluk.DescriptionDocument.Description.Long target = null;
                target = (pl.daniluk.DescriptionDocument.Description.Long)get_store().find_element_user(LONG$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "long" element
         */
        public int sizeOfLongArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LONG$2);
            }
        }
        
        /**
         * Sets array of all "long" element
         */
        public void setLongArray(pl.daniluk.DescriptionDocument.Description.Long[] xlongArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(xlongArray, LONG$2);
            }
        }
        
        /**
         * Sets ith "long" element
         */
        public void setLongArray(int i, pl.daniluk.DescriptionDocument.Description.Long xlong)
        {
            synchronized (monitor())
            {
                check_orphaned();
                pl.daniluk.DescriptionDocument.Description.Long target = null;
                target = (pl.daniluk.DescriptionDocument.Description.Long)get_store().find_element_user(LONG$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(xlong);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "long" element
         */
        public pl.daniluk.DescriptionDocument.Description.Long insertNewLong(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                pl.daniluk.DescriptionDocument.Description.Long target = null;
                target = (pl.daniluk.DescriptionDocument.Description.Long)get_store().insert_element_user(LONG$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "long" element
         */
        public pl.daniluk.DescriptionDocument.Description.Long addNewLong()
        {
            synchronized (monitor())
            {
                check_orphaned();
                pl.daniluk.DescriptionDocument.Description.Long target = null;
                target = (pl.daniluk.DescriptionDocument.Description.Long)get_store().add_element_user(LONG$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "long" element
         */
        public void removeLong(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LONG$2, i);
            }
        }
        /**
         * An XML short(@http://xmlbeans.apache.org/samples/template/sampletemplate).
         *
         * This is a complex type.
         */
        public static class ShortImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements pl.daniluk.DescriptionDocument.Description.Short
        {
            private static final long serialVersionUID = 1L;
            
            public ShortImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName INTRO$0 = 
                new javax.xml.namespace.QName("http://xmlbeans.apache.org/samples/template/sampletemplate", "intro");
            private static final javax.xml.namespace.QName CONTENT$2 = 
                new javax.xml.namespace.QName("http://xmlbeans.apache.org/samples/template/sampletemplate", "content");
            
            
            /**
             * Gets the "intro" element
             */
            public java.lang.String getIntro()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTRO$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "intro" element
             */
            public org.apache.xmlbeans.XmlString xgetIntro()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTRO$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "intro" element
             */
            public boolean isSetIntro()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INTRO$0) != 0;
                }
            }
            
            /**
             * Sets the "intro" element
             */
            public void setIntro(java.lang.String intro)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTRO$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTRO$0);
                    }
                    target.setStringValue(intro);
                }
            }
            
            /**
             * Sets (as xml) the "intro" element
             */
            public void xsetIntro(org.apache.xmlbeans.XmlString intro)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTRO$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTRO$0);
                    }
                    target.set(intro);
                }
            }
            
            /**
             * Unsets the "intro" element
             */
            public void unsetIntro()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INTRO$0, 0);
                }
            }
            
            /**
             * Gets the "content" element
             */
            public java.lang.String getContent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENT$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "content" element
             */
            public org.apache.xmlbeans.XmlString xgetContent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENT$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "content" element
             */
            public boolean isSetContent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CONTENT$2) != 0;
                }
            }
            
            /**
             * Sets the "content" element
             */
            public void setContent(java.lang.String content)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENT$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTENT$2);
                    }
                    target.setStringValue(content);
                }
            }
            
            /**
             * Sets (as xml) the "content" element
             */
            public void xsetContent(org.apache.xmlbeans.XmlString content)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENT$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTENT$2);
                    }
                    target.set(content);
                }
            }
            
            /**
             * Unsets the "content" element
             */
            public void unsetContent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CONTENT$2, 0);
                }
            }
        }
        /**
         * An XML long(@http://xmlbeans.apache.org/samples/template/sampletemplate).
         *
         * This is a complex type.
         */
        public static class LongImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements pl.daniluk.DescriptionDocument.Description.Long
        {
            private static final long serialVersionUID = 1L;
            
            public LongImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName INTRO$0 = 
                new javax.xml.namespace.QName("http://xmlbeans.apache.org/samples/template/sampletemplate", "intro");
            private static final javax.xml.namespace.QName CONTENT$2 = 
                new javax.xml.namespace.QName("http://xmlbeans.apache.org/samples/template/sampletemplate", "content");
            
            
            /**
             * Gets the "intro" element
             */
            public java.lang.String getIntro()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTRO$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "intro" element
             */
            public org.apache.xmlbeans.XmlString xgetIntro()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTRO$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "intro" element
             */
            public boolean isSetIntro()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INTRO$0) != 0;
                }
            }
            
            /**
             * Sets the "intro" element
             */
            public void setIntro(java.lang.String intro)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTRO$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTRO$0);
                    }
                    target.setStringValue(intro);
                }
            }
            
            /**
             * Sets (as xml) the "intro" element
             */
            public void xsetIntro(org.apache.xmlbeans.XmlString intro)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTRO$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTRO$0);
                    }
                    target.set(intro);
                }
            }
            
            /**
             * Unsets the "intro" element
             */
            public void unsetIntro()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INTRO$0, 0);
                }
            }
            
            /**
             * Gets the "content" element
             */
            public java.lang.String getContent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENT$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "content" element
             */
            public org.apache.xmlbeans.XmlString xgetContent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENT$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "content" element
             */
            public boolean isSetContent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CONTENT$2) != 0;
                }
            }
            
            /**
             * Sets the "content" element
             */
            public void setContent(java.lang.String content)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENT$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTENT$2);
                    }
                    target.setStringValue(content);
                }
            }
            
            /**
             * Sets (as xml) the "content" element
             */
            public void xsetContent(org.apache.xmlbeans.XmlString content)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENT$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTENT$2);
                    }
                    target.set(content);
                }
            }
            
            /**
             * Unsets the "content" element
             */
            public void unsetContent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CONTENT$2, 0);
                }
            }
        }
    }
}
