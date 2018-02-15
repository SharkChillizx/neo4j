/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.values.storable;

import org.neo4j.values.ValueMapper;
import org.neo4j.values.utils.ValueMath;

import static java.lang.String.format;

public final class DoubleValue extends FloatingPointValue
{
    private final double value;

    DoubleValue( double value )
    {
        this.value = value;
    }

    public double value()
    {
        return value;
    }

    @Override
    public double doubleValue()
    {
        return value;
    }

    @Override
    public <E extends Exception> void writeTo( ValueWriter<E> writer ) throws E
    {
        writer.writeFloatingPoint( value );
    }

    @Override
    public Double asObjectCopy()
    {
        return value;
    }

    @Override
    public String prettyPrint()
    {
        return Double.toString( value );
    }

    @Override
    public String toString()
    {
        return format( "Double(%e)", value );
    }

    @Override
    public <T> T map( ValueMapper<T> mapper )
    {
        return mapper.mapDouble( this );
    }

    @Override
    NumberValue minus( byte b )
    {
        return ValueMath.subtract( value, b );
    }

    @Override
    NumberValue minus( short b )
    {
        return ValueMath.subtract( value, b );
    }

    @Override
    NumberValue minus( int b )
    {
        return ValueMath.subtract( value, b );
    }

    @Override
    NumberValue minus( long b )
    {
        return ValueMath.subtract( value, b );
    }

    @Override
    NumberValue minus( float b )
    {
        return ValueMath.subtract( value, b );
    }

    @Override
    NumberValue minus( double b )
    {
        return ValueMath.subtract( value, b );
    }

    @Override
    NumberValue plus( byte b )
    {
        return ValueMath.add( value, b );
    }

    @Override
    NumberValue plus( short b )
    {
        return ValueMath.add( value, b );
    }

    @Override
    NumberValue plus( int b )
    {
        return ValueMath.add( value, b );
    }

    @Override
    NumberValue plus( long b )
    {
        return ValueMath.add( value, b );
    }

    @Override
    NumberValue plus( float b )
    {
        return ValueMath.add( value, b );
    }

    @Override
    NumberValue plus( double b )
    {
        return ValueMath.add( value, b );
    }

    @Override
    NumberValue times( byte b )
    {
        return ValueMath.multiply( value, b );
    }

    @Override
    NumberValue times( short b )
    {
        return ValueMath.multiply( value, b );
    }

    @Override
    NumberValue times( int b )
    {
        return ValueMath.multiply( value, b );
    }

    @Override
    NumberValue times( long b )
    {
        return ValueMath.multiply( value, b );
    }

    @Override
    NumberValue times( float b )
    {
        return ValueMath.multiply( value, b );
    }

    @Override
    NumberValue times( double b )
    {
        return ValueMath.multiply( value, b );
    }
}
