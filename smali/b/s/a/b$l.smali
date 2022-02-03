.class Lb/s/a/b$l;
.super Landroid/database/DataSetObserver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/s/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "l"
.end annotation


# instance fields
.field final synthetic a:Lb/s/a/b;


# direct methods
.method constructor <init>(Lb/s/a/b;)V
    .locals 0

    iput-object p1, p0, Lb/s/a/b$l;->a:Lb/s/a/b;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 1

    iget-object v0, p0, Lb/s/a/b$l;->a:Lb/s/a/b;

    invoke-virtual {v0}, Lb/s/a/b;->g()V

    return-void
.end method

.method public onInvalidated()V
    .locals 1

    iget-object v0, p0, Lb/s/a/b$l;->a:Lb/s/a/b;

    invoke-virtual {v0}, Lb/s/a/b;->g()V

    return-void
.end method
