﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using Xunit;

namespace Microsoft.Rest.ClientRuntime.Tests.Internals
{
    public class LazyListTest
    {
        [Fact]
        public void LazyByDefaultTest()
        {
            // Arrange
            var lazyList = new LazyList<string>();

            // Act
            var initialized = lazyList.IsInitialized;

            // Assert
            Assert.False(initialized);
        }

        [Fact]
        public void LazyAddTest()
        {
            // Arrange
            var lazyList = new LazyList<string>();

            // Act
            lazyList.Add("item");
            var initialized = lazyList.IsInitialized;

            // Assert
            Assert.True(initialized);
        }
    }
}
