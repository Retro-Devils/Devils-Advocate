.class Lb/p/c$h;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/p/c;->n(Landroid/view/ViewGroup;Lb/p/s;Lb/p/s;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/p/c$k;

.field final synthetic b:Lb/p/c;

.field private mViewBounds:Lb/p/c$k;


# direct methods
.method constructor <init>(Lb/p/c;Lb/p/c$k;)V
    .locals 0

    iput-object p1, p0, Lb/p/c$h;->b:Lb/p/c;

    iput-object p2, p0, Lb/p/c$h;->a:Lb/p/c$k;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    iput-object p2, p0, Lb/p/c$h;->mViewBounds:Lb/p/c$k;

    return-void
.end method
