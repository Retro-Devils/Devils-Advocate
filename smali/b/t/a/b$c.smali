.class Lb/t/a/b$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/t/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lb/t/a/b;


# direct methods
.method constructor <init>(Lb/t/a/b;)V
    .locals 0

    iput-object p1, p0, Lb/t/a/b$c;->b:Lb/t/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lb/t/a/b$c;->b:Lb/t/a/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lb/t/a/b;->setScrollState(I)V

    iget-object v0, p0, Lb/t/a/b$c;->b:Lb/t/a/b;

    invoke-virtual {v0}, Lb/t/a/b;->D()V

    return-void
.end method
