/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.transformation.trace;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Franco Bergomi
 * 
 */
public class TraceHelper {

  /**
   * For the moment all the traces are stored in this instance of TraceHelper When MDTrace will be available this class will not store them anymore When dealing
   * with traces, coders will always use the TraceHelper, whose concern will be the creation, deletion, etc of traces on ALL sorts of elements Coders shall not
   * create any Trace Instance. (separation of concerns) When a trace is needed => call the
   * {@code TraceHelper.eINSTANCE().addTraceFromToWithRole(source, target, role);} method
   */
  private List<Trace> traces = new ArrayList<Trace>();

  /**
   * private constructor. This constructor doesn't have to be called from outside NOW. When a transverse trace framework will be available, this constructor
   * will be marked public
   */
  public TraceHelper() {
    traces = new ArrayList<Trace>();
  }

  /**
   * Allows to reset the TraceHelper instance (in the actual implementation, it flushes the traces)
   */
  public void reset() {
    traces = new ArrayList<Trace>();
  }

  /**
   * Creates a trace from the source_p {@link Object} to the target {@link Object} with the given role
   * 
   * @param source_p
   * @param target_p
   * @param role_p
   */
  public void addTraceWithRole(Object source_p, Object target_p, String role_p) {
    for (Trace trace : traces) {
      if (trace.getSource() != null && trace.getSource().equals(source_p) && trace.getRole() != null && trace.getRole().equals(role_p)) {
        traces.remove(trace);
        break;
      }
    }
    Trace temp = new Trace(source_p, target_p, role_p);
    traces.add(temp);
  }

  public List<Trace> getOutgoingTraces(Object source) {
    ArrayList<Trace> outgoingTraces = new ArrayList<Trace>();

    for (Trace trace : traces) {
      if (trace.getSource() != null && trace.getSource().equals(source)) {
		outgoingTraces.add(trace);
	}
    }
    return outgoingTraces;
  }

  /**
   * Even if this method does'nt seem to make sense for the moment, DO NOT REMOVE IT.
   * @param source_p
   * @param string_p
   * @return
   */
  public List<Trace> getOutgoingTracesWithRole(Object source_p, String string_p) {
    ArrayList<Trace> matchingTraces = new ArrayList<Trace>();

    for (Trace trace : traces) {
      if (trace.getSource() != null && trace.getSource().equals(source_p)) {
		if (trace.getRole() != null && trace.getRole().equals(string_p)) {
			matchingTraces.add(trace);
		}
	}
    }
    return matchingTraces;
  }

  public List<Trace> getIncomingTraces(Object target) {
    ArrayList<Trace> incomingTraces = new ArrayList<Trace>();

    for (Trace trace : traces) {
      if (trace.getTarget() != null && trace.getTarget().equals(target)) {
		incomingTraces.add(trace);
	}
    }
    return incomingTraces;
  }

  /**
   * Return the first outGoingTrace with the given role.
   * @param source_p :
   * @param string_p : the role
   * @return
   */
  public Trace getOutgoingTraceWithRole(Object source_p, String string_p) {
    for (Trace trace : traces) {
      if (trace.getSource() != null && trace.getSource().equals(source_p)) {
		if (trace.getRole() != null && trace.getRole().equals(string_p)) {
			return trace;
		}
	}
    }
    return null;
  }

  public List<Trace> getIncomingTracesWithRole(Object target_p, String string_p) {
    ArrayList<Trace> matchingTraces = new ArrayList<Trace>();

    for (Trace trace : traces) {
      if (trace.getTarget() != null && trace.getTarget().equals(target_p)) {
		if (trace.getRole() != null && trace.getRole().equals(string_p)) {
			matchingTraces.add(trace);
		}
	}
    }
    return matchingTraces;
  }

  public Trace getIncomingTraceWithRole(Object target_p, String string_p) {

    for (Trace trace : traces) {
      if (trace.getTarget() != null && trace.getTarget().equals(target_p)) {
		if (trace.getRole() != null && trace.getRole().equals(string_p)) {
			return trace;
		}
	}
    }
    return null;
  }

  /**
   * Method that tells if the given Object is the result of the merge of different {@link Object} instances with the same Role
   * 
   * @param element
   * @param role
   * @return
   */
  public boolean isResultOfMergeWithRole(Object element, String role) {
    return (getIncomingTracesWithRole(element, role).size() > 1);
  }

  public void removeTrace(Trace t) {
    traces.remove(t);
  }

  public void removeAllOutgoingTraces(Object object_p) {
    List<Trace> outgoing = getOutgoingTraces(object_p);
    for (Trace trace : outgoing) {
      removeTrace(trace);
    }
  }

  public void removeAllIncomingTraces(Object object_p) {
    List<Trace> incoming = getIncomingTraces(object_p);
    for (Trace trace : incoming) {
      removeTrace(trace);
    }
  }

  public void removeOutGoingTraces(Object object_p, String role) {
    List<Trace> outgoing = getOutgoingTraces(object_p);
    for (Trace trace : outgoing) {
      if (trace.getRole().equals(role)) {
		removeTrace(trace);
	}
    }
  }

  public void removeAllTraces(Object object_p) {
    removeAllIncomingTraces(object_p);
    removeAllOutgoingTraces(object_p);
  }

  public Set<Object> getAllUniqueKeys() {
    Set<Object> set = new HashSet<Object>();
    for (Trace trace : traces) {
      set.add(trace.getSource());
    }
    return set;
  }

  /**
   * @return the traces
   */
  public List<Trace> getTraces() {
    return traces;
  }

}
