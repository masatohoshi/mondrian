/*
// $Id$
// This software is subject to the terms of the Eclipse Public License v1.0
// Agreement, available at the following URL:
// http://www.eclipse.org/legal/epl-v10.html.
// You must accept the terms of that agreement to use this software.
// Copyright (C) 2011-2011 Julian Hyde
// All Rights Reserved.
*/
package mondrian.server.monitor;

/**
 * Visitor for events.
 *
 * @version $Id$
 */
public interface Visitor<T> {
    T visit(ConnectionStartEvent event);
    T visit(ConnectionEndEvent event);
    T visit(StatementStartEvent event);
    T visit(StatementEndEvent event);
    T visit(ExecutionStartEvent event);
    T visit(ExecutionPhaseEvent event);
    T visit(ExecutionEndEvent event);
    T visit(SqlStatementStartEvent event);
    T visit(SqlStatementExecuteEvent event);
    T visit(SqlStatementEndEvent event);
}

// End Visitor.java