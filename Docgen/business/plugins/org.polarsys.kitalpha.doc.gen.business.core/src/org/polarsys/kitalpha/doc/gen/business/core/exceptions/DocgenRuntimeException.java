package org.polarsys.kitalpha.doc.gen.business.core.exceptions;

public class DocgenRuntimeException extends RuntimeException {

    public DocgenRuntimeException(Exception e) {
        super(e.getLocalizedMessage(), e);
    }

    private static final long serialVersionUID = -6449266490052767241L;

}
