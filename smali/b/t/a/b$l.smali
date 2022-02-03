.class Lb/t/a/b$l;
.super Landroid/database/DataSetObserver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/t/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "l"
.end annotation


# instance fields
.field final synthetic a:Lb/t/a/b;


# direct methods
.method constructor <init>(Lb/t/a/b;)V
    .locals 0

    iput-object p1, p0, Lb/t/a/b$l;->a:Lb/t/a/b;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 1

    iget-object v0, p0, Lb/t/a/b$l;->a:Lb/t/a/b;

    invoke-virtual {v0}, Lb/t/a/b;->g()V

    return-void
.end method

.method public onInvalidated()V
    .locals 1

    iget-object v0, p0, Lb/t/a/b$l;->a:Lb/t/a/b;

    invoke-virtual {v0}, Lb/t/a/b;->g()V

    return-void
.end method
