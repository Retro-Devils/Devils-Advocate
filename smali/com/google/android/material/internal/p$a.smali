.class final Lcom/google/android/material/internal/p$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/g/k/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/internal/p;->a(Landroid/view/View;Lcom/google/android/material/internal/p$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/material/internal/p$c;

.field final synthetic b:Lcom/google/android/material/internal/p$d;


# direct methods
.method constructor <init>(Lcom/google/android/material/internal/p$c;Lcom/google/android/material/internal/p$d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/internal/p$a;->a:Lcom/google/android/material/internal/p$c;

    iput-object p2, p0, Lcom/google/android/material/internal/p$a;->b:Lcom/google/android/material/internal/p$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Lb/g/k/a0;)Lb/g/k/a0;
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/internal/p$a;->a:Lcom/google/android/material/internal/p$c;

    new-instance v1, Lcom/google/android/material/internal/p$d;

    iget-object v2, p0, Lcom/google/android/material/internal/p$a;->b:Lcom/google/android/material/internal/p$d;

    invoke-direct {v1, v2}, Lcom/google/android/material/internal/p$d;-><init>(Lcom/google/android/material/internal/p$d;)V

    invoke-interface {v0, p1, p2, v1}, Lcom/google/android/material/internal/p$c;->a(Landroid/view/View;Lb/g/k/a0;Lcom/google/android/material/internal/p$d;)Lb/g/k/a0;

    move-result-object p1

    return-object p1
.end method
