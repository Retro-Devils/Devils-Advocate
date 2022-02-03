.class public Lb/p/b;
.super Lb/p/q;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/p/q;-><init>()V

    invoke-direct {p0}, Lb/p/b;->p0()V

    return-void
.end method

.method private p0()V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lb/p/q;->m0(I)Lb/p/q;

    new-instance v1, Lb/p/d;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lb/p/d;-><init>(I)V

    invoke-virtual {p0, v1}, Lb/p/q;->e0(Lb/p/m;)Lb/p/q;

    move-result-object v1

    new-instance v2, Lb/p/c;

    invoke-direct {v2}, Lb/p/c;-><init>()V

    invoke-virtual {v1, v2}, Lb/p/q;->e0(Lb/p/m;)Lb/p/q;

    move-result-object v1

    new-instance v2, Lb/p/d;

    invoke-direct {v2, v0}, Lb/p/d;-><init>(I)V

    invoke-virtual {v1, v2}, Lb/p/q;->e0(Lb/p/m;)Lb/p/q;

    return-void
.end method
