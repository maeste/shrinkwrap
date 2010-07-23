/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.shrinkwrap.tar.api.importer;

import org.jboss.javatar.TarGzInputStream;
import org.jboss.shrinkwrap.api.Assignable;
import org.jboss.shrinkwrap.api.importer.StreamImporter;

/**
 * {@link Assignable} type capable of importing TAR archive
 * content encoded in GZIP compression.
 *
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 */
public interface TarGzImporter extends StreamImporter<TarGzInputStream, TarGzImporter>
{
   // Inherited contracts
}