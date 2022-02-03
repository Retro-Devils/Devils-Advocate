.class Lb/p/q$b;
.super Lb/p/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/p/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field a:Lb/p/q;


# direct methods
.method constructor <init>(Lb/p/q;)V
    .locals 0

    invoke-direct {p0}, Lb/p/n;-><init>()V

    iput-object p1, p0, Lb/p/q$b;->a:Lb/p/q;

    return-void
.end method


# virtual methods
.method public c(Lb/p/m;)V
    .locals 1

    iget-object p1, p0, Lb/p/q$b;->a:Lb/p/q;

    iget-boolean v0, p1, Lb/p/q;->O:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lb/p/m;->a0()V

    iget-object p1, p0, Lb/p/q$b;->a:Lb/p/q;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lb/p/q;->O:Z

    :cond_0
    return-void
.end method

.method public e(Lb/p/m;)V
    .locals 2

    iget-object v0, p0, Lb/p/q$b;->a:Lb/p/q;

    iget v1, v0, Lb/p/q;->N:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lb/p/q;->N:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lb/p/q;->O:Z

    invoke-virtual {v0}, Lb/p/m;->p()V

    :cond_0
    invoke-virtual {p1, p0}, Lb/p/m;->P(Lb/p/m$f;)Lb/p/m;

    return-void
.end method
